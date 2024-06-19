#!/bin/sh
WORK_DIR=`dirname $(cd $(dirname $0) && pwd)`
echo "[info]WORK_DIR = ${WORK_DIR}"

# TODO 脚本待完善
# Maven打包
# 制作docker镜像
# 推送docker镜像至镜像仓库

#===============================================
# 打包构建
#===============================================

#===============================================
# 获取项目信息
#===============================================
get_app_info(){
  cd $WORK_DIR
  # 获取项目构建名称
  APP_NAME=`sed -n '3p' $WORK_DIR/.build/info.txt`
  echo "[info]APP_NAME = ${APP_NAME}"
  # 获取项目构建版本
  APP_VERSION=`sed -n '5p' $WORK_DIR/.build/info.txt`
  echo "[info]APP_VERSION = ${APP_VERSION}"
  # 获取项目归档名称
  APP_ARCHIVE_NAME=`sed -n '7p' $WORK_DIR/.build/info.txt`
  echo "[info]APP_ARCHIVE_NAME = ${APP_ARCHIVE_NAME}"
  # 获取项目启动类包路径
  APP_MAIN_CLASS=`sed -n '9p' $WORK_DIR/.build/info.txt`
  echo "[info]APP_MAIN_CLASS = ${APP_MAIN_CLASS}"
}

#===============================================
# 打包构建

# 获取项目信息
get_app_info