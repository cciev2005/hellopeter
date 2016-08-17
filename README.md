# hellopeter
Sample Web App

This is a sample web app that listens port 8080.
You should use maven and dpkg to make and install it and its .deb package:

	mvn package
	dpkg -i target/deb/hellopeter*.jar


When .deb package is installed then it have the following logs and pids directoies structure:
logs -> /var/log/hellopeter
pid -> /var/run/

 
