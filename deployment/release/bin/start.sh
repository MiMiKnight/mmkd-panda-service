#!/bin/sh
# TODO 脚本待完善
# 指定用户

# 当前shell脚本所在绝对路径目录
current_dir=$(
	cd $(dirname ${BASH_SOURCE[0]})
	pwd
)
echo $current_dir
# 当前shell脚本所在绝对路径目录上一级目录
current_dir_parent=$(dirname "$current_dir")

java -jar $current_dir_parent/lib/@app.jar.name@.jar \
-server \
-Duser.language=en \
-Dfile.encoding=UTF-8 \
-Duser.timezone=GMT+04:00 \
--jasypt.encryptor.password=5177251cc96740fdae33893599768b9e

#===========================================================================================
# Error Exit
#===========================================================================================
error_exit ()
{
    echo "ERROR: $1 !!"
    exit 1
}

#===========================================================================================
# Check and Set JAVA_HOME
#===========================================================================================
java_home() {
  [ ! -e "$JAVA_HOME/bin/java" ] && JAVA_HOME=$HOME/jdk/java
  [ ! -e "$JAVA_HOME/bin/java" ] && JAVA_HOME=/usr/java
  [ ! -e "$JAVA_HOME/bin/java" ] && JAVA_HOME=/opt/taobao/java
  [ ! -e "$JAVA_HOME/bin/java" ] && unset JAVA_HOME

  if [ -z "$JAVA_HOME" ]; then
    JAVA_PATH=$(which java)
    if [ -z "$JAVA_PATH" ]; then
      error_exit "Please set the JAVA_HOME variable in your environment, We need java(x64)! jdk8 or later is better!"
    fi
    JAVA_HOME=$(dirname "$JAVA_PATH")/..
    JAVA_HOME=$(cd "$JAVA_HOME" && pwd)
    export JAVA_HOME
  fi
}
