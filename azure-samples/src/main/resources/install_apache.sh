#!/bin/bash

sudo echo "deb http://archive.ubuntu.com/ubuntu trusty main universe restricted multiverse" > /etc/apt/sources.list

sudo apt-get update

sudo apt-get dist-upgrade

# install apache
sudo apt-get -y install apache2

# restart Apache
sudo apachectl restart
