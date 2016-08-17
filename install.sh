#!/bin/sh
# build and install script
sudo apt-get update
sudo apt-get -y  install git maven openjdk-7-jdk
git clone https://github.com/cciev2005/hellopeter
cd hellopeter
mvn package
sudo dpkg -i target/hellopeter*.deb
