#!/bin/bash

sudo apt-get update

sudo apt-get dist-upgrade

# install apache
sudo apt-get -y install apache2

# restart Apache
sudo apachectl restart
