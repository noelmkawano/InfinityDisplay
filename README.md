# The Infinity Display

<img src="IMG_20150413_081353.jpg" width="500px"/>

## Overview

This is a revised version of the Activator 'play-java' template system which:

  * Conforms to the ICS software engineering coding standards

  * Illustrates how to incorporate Twitter Bootstrap 3 into Play.

To use it, first create an empty GitHub repo and clone to your desktop.

Next, cd into your new repo and set ics-play-bootstrap as the upstream master:

    git remote add upstream https://github.com/ics613s15/ics-play-bootstrap.git

Next, merge the contents of ics-play-bootstrap into your new empty repo:

    git fetch upstream
    git merge upstream/master

Now your repo will contain the ics-play-bootstrap repo.

Edit the build.sbt file to change the name to your new project.

## Features

ics-play-bootstrap provides the following features:

  * Modifications to the "play-java" Activator template to eliminate checkstyle errors.

  * Rename view files to be capitalized (i.e. Index.scala.html, not index.scala.html). This is so that the Java class generated by these templates are capitalized, conforming to standard Java practice.

  * Modifications to [Main.scala.html](https://github.com/ics613s15/ics-play-bootstrap/blob/master/app/views/Main.scala.html) template to load [Twitter Bootstrap 3](http://getbootstrap.com/) files using CDN sites.

  * Modifications to illustrate simple page navigation through changes to the [controller](https://github.com/ics613s15/ics-play-bootstrap/blob/master/app/controllers/Application.java), [routes](https://github.com/ics613s15/ics-play-bootstrap/blob/master/conf/routes), and [view](https://github.com/ics613s15/ics-play-bootstrap/tree/master/app/views) files.

  * The [navbar](https://github.com/ics613s15/ics-play-bootstrap/blob/master/app/views/Main.scala.html) highlights the current active page through a parameter passed from the controller.

  * The [main.css](https://github.com/ics613s15/ics-play-bootstrap/blob/master/public/stylesheets/main.css) adjusts body padding due to the use of the fixed-top navbar.

  * Support for simple [tests](https://github.com/ics613s15/ics-play-bootstrap/blob/master/test/test/IntegrationTest.java).

## Screencast

A short screencast containing a walkthrough of these features is available here.

## Version information

Play 2.3.7, Bootstrap 3.3.2

