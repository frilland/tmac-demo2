#!/bin/bash
id=$(ps -ef|grep tmac-demo|grep -v grep|awk '{print $2}')
if [ ! $id ]; then echo "process not started"; else kill -9 $id;fi
sleep 1
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
echo $DIR
echo "我要启动了"
java -version
nohup java  -jar $DIR/tmac-demo-0.0.1.jar > output.log 2>&1 &
echo "我启动完了"
sleep ${logtime:-30}
cat output.log