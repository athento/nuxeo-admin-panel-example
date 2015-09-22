#nuxeo-admin-panel-example

#Synopsis

This plugin contains an example of how to extend the tabs on the administration area.

#Installation

You just have to compile the pom.xml using Maven and deploy the plugin in. To do this, you must use the following script:

	cd nuxeo-admin-panel-example-master
	mvn clean install
	cp target/admin_Tab-*.jar $NUXEO_HOME/nxserver/plugins

And then, restart your nuxeo server and enjoy.
