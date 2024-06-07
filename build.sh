#!/bin/bash

readonly ServerName="FileSystemServer"

rm -r $ServerName.tar.gz
#rm -r target
# 如果有问题可以Idea编译，再打包
#mvn compile
#mvn deploy

tar -cvf $ServerName.tar.gz ./target
