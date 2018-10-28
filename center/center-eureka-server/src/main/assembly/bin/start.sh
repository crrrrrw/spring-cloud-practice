#!/bin/sh
curdir=`dirname $0`
cd $curdir
curdir=`pwd`

PROJECTNAME=center-eureka-server
APP_NAME=`ls  ../lib/$PROJECTNAME-*.jar | grep -o $PROJECTNAME | tr -d '\r'`
echo $APP_NAME
JAR_NAME=`ls ../lib | grep center-eureka-server`
ECHO $JAR_NAME
MAIN_CLASS=com.crw.springcloud.center.EurekaServerApplication
APP_HOME=..
LIB_PATH=$APP_HOME/lib

JAVA_ARGS="-server -Xmx256m -Xmx256m -XX:NewSize=64m -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=78 -Xloggc:$APP_HOME/logs/gc.log"

CLASSPATH=$APP_HOME:$APP_HOME/resources:$LIB_PATH/$APP_NAME

cd $APP_HOME/bin

echo "$CLASSPATH"

echo java $JAVA_ARGS -classpath $CLASSPATH $MAIN_CLASS

#nohup java $JAVA_ARGS -classpath $CLASSPATH $MAIN_CLASS  1> /dev/null 2>&1 &
nohup java $JAVA_ARGS -jar $LIB_PATH/$JAR_NAME  1> /dev/null 2>&1 &