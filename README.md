# hellopeter
Sample Web App

This is a sample web app that listens port 8080.
You should use maven and dpkg to make and install it and its .deb package:

	mvn package
	sudo dpkg -i target/hellopeter*.deb


When .deb package is installed then we have the following logs and pids directoies structure:

logs -> /var/log/hellopeter/

pid -> /var/run/

To check that is working do:

	curl http://127.0.0.1:8080/ping

You should get JSON response like a:

	{"id":1,"content":"Pong","date":"17/08/2016 05:09:40 +0000"} 

For install on a clean ubunut box use:

	curl https://raw.githubusercontent.com/cciev2005/hellopeter/master/install.sh | sh
