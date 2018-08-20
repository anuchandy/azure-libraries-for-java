/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.compute.ComputeGallery;
import com.microsoft.azure.management.compute.ComputeGalleryImage;
import com.microsoft.azure.management.compute.ComputeGalleryImageVersion;
import com.microsoft.azure.management.compute.Disallowed;
import com.microsoft.azure.management.compute.DiskSkuTypes;
import com.microsoft.azure.management.compute.GalleryImageIdentifier;
import com.microsoft.azure.management.compute.ImagePurchasePlan;
import com.microsoft.azure.management.compute.OperatingSystemStateTypes;
import com.microsoft.azure.management.compute.OperatingSystemTypes;
import com.microsoft.azure.management.compute.RecommendedMachineConfiguration;
import com.microsoft.azure.management.compute.ResourceRange;
import com.microsoft.azure.management.compute.StorageAccountTypes;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * The implementation for ComputeGalleryImage and its create and update interfaces.
 */
@LangDefinition
class ComputeGalleryImageImpl
        extends CreatableUpdatableImpl<ComputeGalleryImage, GalleryImageInner, ComputeGalleryImageImpl>
        implements ComputeGalleryImage, ComputeGalleryImage.Definition, ComputeGalleryImage.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String galleryName;
    private String galleryImageName;

    ComputeGalleryImageImpl(String name, ComputeManager manager) {
        super(name, new GalleryImageInner());
        this.manager = manager;
        // Set resource name
        this.galleryImageName = name;
        //
    }

    ComputeGalleryImageImpl(GalleryImageInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.galleryImageName = inner.name();
        // resource ancestor names
        this.resourceGroupName = getValueFromIdByName(inner.id(), "resourceGroups");
        this.galleryName = getValueFromIdByName(inner.id(), "computeGalleries");
        this.galleryImageName = getValueFromIdByName(inner.id(), "images");
        //
    }

    @Override
    public Observable<ComputeGalleryImageVersion> getVersionAsync(String versionName) {
        return this.manager().computeGalleryImageVersions().getByGalleryImageAsync(this.resourceGroupName, this.galleryName, this.galleryImageName, versionName);
    }

    @Override
    public ComputeGalleryImageVersion getVersion(String versionName) {
        return this.manager().computeGalleryImageVersions().getByGalleryImage(this.resourceGroupName, this.galleryName, this.galleryImageName, versionName);
    }

    @Override
    public Observable<ComputeGalleryImageVersion> listVersionsAsync() {
        return this.manager().computeGalleryImageVersions().listByGalleryImageAsync(this.resourceGroupName, this.galleryName, this.galleryImageName);
    }

    @Override
    public PagedList<ComputeGalleryImageVersion> listVersions() {
        return this.manager().computeGalleryImageVersions().listByGalleryImage(this.resourceGroupName, this.galleryName, this.galleryImageName);
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ComputeGalleryImage> createResourceAsync() {
        GalleryImagesInner client = this.manager().inner().galleryImages();
        return client.createOrUpdateAsync(this.resourceGroupName, this.galleryName, this.galleryImageName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ComputeGalleryImage> updateResourceAsync() {
        GalleryImagesInner client = this.manager().inner().galleryImages();
        return client.createOrUpdateAsync(this.resourceGroupName, this.galleryName, this.galleryImageName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GalleryImageInner> getInnerAsync() {
        GalleryImagesInner client = this.manager().inner().galleryImages();
        return client.getAsync(this.resourceGroupName, this.galleryName, this.galleryImageName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public List<DiskSkuTypes> unsupportedDiskTypes() {
        if (this.inner().disallowed() == null || this.inner().disallowed().diskTypes() == null) {
            return Collections.unmodifiableList(new ArrayList<DiskSkuTypes>());
        } else {
            List<DiskSkuTypes> diskTypes = new ArrayList<DiskSkuTypes>();
            for (String diskTypeStr : this.inner().disallowed().diskTypes()) {
                diskTypes.add(DiskSkuTypes.fromStorageAccountType(StorageAccountTypes.fromString(diskTypeStr)));
            }
            return Collections.unmodifiableList(diskTypes);
        }
    }

    @Override
    public Disallowed disallowed() {
        return this.inner().disallowed();
    }

    @Override
    public DateTime endOfLifeDate() {
        return this.inner().endOfLifeDate();
    }

    @Override
    public String eula() {
        return this.inner().eula();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public GalleryImageIdentifier identifier() {
        return this.inner().identifier();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OperatingSystemStateTypes osState() {
        return this.inner().osState();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String privacyStatementUri() {
        return this.inner().privacyStatementUri();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ImagePurchasePlan purchasePlan() {
        return this.inner().purchasePlan();
    }

    @Override
    public RecommendedMachineConfiguration recommendedVirtualMachineConfiguration() {
        return this.inner().recommended();
    }

    @Override
    public String releaseNoteUri() {
        return this.inner().releaseNoteUri();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ComputeGalleryImageImpl withExistingGallery(String resourceGroupName, String galleryName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withExistingGallery(ComputeGallery gallery) {
        this.resourceGroupName = gallery.resourceGroupName();
        this.galleryName = gallery.name();
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withLocation(Region location) {
        this.inner().withLocation(location.toString());
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withIdentifier(GalleryImageIdentifier identifier) {
        this.inner().withIdentifier(identifier);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withIdentifier(String publisher, String offer, String sku) {
        this.inner().withIdentifier(new GalleryImageIdentifier()
                .withPublisher(publisher)
                .withOffer(offer)
                .withSku(sku));
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withGeneralizedWindows() {
        return this.withWindows(OperatingSystemStateTypes.GENERALIZED);
    }

    @Override
    public ComputeGalleryImageImpl withGeneralizedLinux() {
        return this.withLinux(OperatingSystemStateTypes.GENERALIZED);
    }

    @Override
    public ComputeGalleryImageImpl withWindows(OperatingSystemStateTypes osState) {
        this.inner()
                .withOsType(OperatingSystemTypes.WINDOWS)
                .withOsState(osState);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withLinux(OperatingSystemStateTypes osState) {
        this.inner()
                .withOsType(OperatingSystemTypes.LINUX)
                .withOsState(osState);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withUnSupportedDiskType(DiskSkuTypes diskType) {
        if (this.inner().disallowed() == null) {
            this.inner().withDisallowed(new Disallowed());
        }
        if (this.inner().disallowed().diskTypes() == null) {
            this.inner().disallowed().withDiskTypes(new ArrayList<String>());
        }
        boolean found = false;
        String newDiskTypeStr = diskType.toString();
        for (String diskTypeStr : this.inner().disallowed().diskTypes()) {
            if (diskTypeStr.equalsIgnoreCase(newDiskTypeStr)) {
                found = true;
                break;
            }
        }
        if (!found) {
            this.inner().disallowed().diskTypes().add(diskType.toString());
        }
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withUnSupportedDiskTypes(List<DiskSkuTypes> diskTypes) {
        if (this.inner().disallowed() == null) {
            this.inner().withDisallowed(new Disallowed());
        }
        this.inner().disallowed().withDiskTypes(new ArrayList<String>());
        for (DiskSkuTypes diskType : diskTypes) {
            this.inner().disallowed().diskTypes().add(diskType.toString());
        }
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withoutUnSupportedDiskType(DiskSkuTypes diskType) {
        if (this.inner().disallowed() != null && this.inner().disallowed().diskTypes() != null) {
            int foundIndex = -1;
            int i = 0;
            String diskTypeToRemove = diskType.toString();
            for (String diskTypeStr : this.inner().disallowed().diskTypes()) {
                if (diskTypeStr.equalsIgnoreCase(diskTypeToRemove)) {
                    foundIndex = i;
                    break;
                }
                i++;
            }
            if (foundIndex != -1) {
                this.inner().disallowed().diskTypes().remove(foundIndex);
            }
        }
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withDisallowed(Disallowed disallowed) {
        this.inner().withDisallowed(disallowed);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withEndOfLifeDate(DateTime endOfLifeDate) {
        this.inner().withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withEula(String eula) {
        this.inner().withEula(eula);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withOsState(OperatingSystemStateTypes osState) {
        this.inner().withOsState(osState);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withPrivacyStatementUri(String privacyStatementUri) {
        this.inner().withPrivacyStatementUri(privacyStatementUri);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withPurchasePlan(String name, String publisher, String product) {
        return this.withPurchasePlan(new ImagePurchasePlan()
                .withName(name)
                .withPublisher(publisher)
                .withProduct(product));
    }

    @Override
    public ComputeGalleryImageImpl withPurchasePlan(ImagePurchasePlan purchasePlan) {
        this.inner().withPurchasePlan(purchasePlan);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withRecommendedMinimumCPUsCountForVirtualMachine(int minCount) {
        if (this.inner().recommended() == null) {
            this.inner().withRecommended(new RecommendedMachineConfiguration());
        }
        if (this.inner().recommended().vCPUs() == null) {
            this.inner().recommended().withVCPUs(new ResourceRange());
        }
        this.inner().recommended().vCPUs().withMin(minCount);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withRecommendedMaximumCPUsCountForVirtualMachine(int maxCount) {
        if (this.inner().recommended() == null) {
            this.inner().withRecommended(new RecommendedMachineConfiguration());
        }
        if (this.inner().recommended().vCPUs() == null) {
            this.inner().recommended().withVCPUs(new ResourceRange());
        }
        this.inner().recommended().vCPUs().withMax(maxCount);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withRecommendedCPUsCountForVirtualMachine(int minCount, int maxCount) {
        if (this.inner().recommended() == null) {
            this.inner().withRecommended(new RecommendedMachineConfiguration());
        }
        this.inner().recommended().withVCPUs(new ResourceRange());
        this.inner().recommended().vCPUs().withMin(minCount);
        this.inner().recommended().vCPUs().withMax(maxCount);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withRecommendedMinimumMemoryForVirtualMachine(int minMB) {
        if (this.inner().recommended() == null) {
            this.inner().withRecommended(new RecommendedMachineConfiguration());
        }
        if (this.inner().recommended().memory() == null) {
            this.inner().recommended().withMemory(new ResourceRange());
        }
        this.inner().recommended().memory().withMin(minMB);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withRecommendedMaximumMemoryForVirtualMachine(int maxMB) {
        if (this.inner().recommended() == null) {
            this.inner().withRecommended(new RecommendedMachineConfiguration());
        }
        if (this.inner().recommended().memory() == null) {
            this.inner().recommended().withMemory(new ResourceRange());
        }
        this.inner().recommended().memory().withMax(maxMB);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withRecommendedMemoryForVirtualMachine(int minMB, int maxMB) {
        if (this.inner().recommended() == null) {
            this.inner().withRecommended(new RecommendedMachineConfiguration());
        }
        this.inner().recommended().withMemory(new ResourceRange());
        this.inner().recommended().memory().withMin(minMB);
        this.inner().recommended().memory().withMax(maxMB);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withRecommendedConfigurationForVirtualMachine(RecommendedMachineConfiguration recommendedConfig) {
        this.inner().withRecommended(recommendedConfig);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withReleaseNoteUri(String releaseNoteUri) {
        this.inner().withReleaseNoteUri(releaseNoteUri);
        return this;
    }

    @Override
    public ComputeGalleryImageImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    private static String getValueFromIdByName(String id, String name) {
        if (id == null) {
            return null;
        }
        Iterable<String> iterable = Arrays.asList(id.split("/"));
        Iterator<String> itr = iterable.iterator();
        while (itr.hasNext()) {
            String part = itr.next();
            if (part != null && part.trim() != "") {
                if (part.equalsIgnoreCase(name)) {
                    if (itr.hasNext()) {
                        return itr.next();
                    } else {
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
