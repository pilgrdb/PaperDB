# PaperDB
Paper is a fast NoSQL-like storage for Java/Kotlin objects on Android with automatic schema migration support.

[![](https://jitpack.io/v/pilgrdb/PaperDB.svg)](https://jitpack.io/#pilgrdb/PaperDB)


Paper's aim is to provide a simple yet fast object storage option for Android. It allows to use Java/Kotlin classes as is: without annotations, factory methods, mandatory class extensions etc. Moreover adding or removing fields to data classes is no longer a pain – all data structure changes are handled automatically.

Library has been moved to Maven Central since service ends for JCenter. Note that group id has been changed. See the updated section below.

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	dependencyResolutionManagement {
			repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
			repositories {
				mavenCentral()
				maven { url 'https://jitpack.io' }
			}
		}

 Step 2. Add the dependency

  -Groovy Gradle
  
 	dependencies {
	        implementation 'com.github.pilgrdb:PaperDB:4.0.1'
	}

 -Kotlin Dls
 
	 dependencies {
		        implementation ("com.github.pilgrdb:PaperDB:4.0.1")
		}

Initialize Paper
Should be initialized once in Application.onCreate():

	Paper.init(context);


All Functions

	List<Person> contacts = ...
	Paper.book().write("contacts", contacts);

	List<Person> = Paper.book().read("contacts");

	List<Person> = Paper.book().read("contacts", new ArrayList<>());

	Paper.book("for-user-1").write("contacts", contacts);
	Paper.book("for-user-2").write("contacts", contacts);

	List<String> allKeys = Paper.book().getAllKeys();

	class Volcano {
	    public String name;
	    public boolean isActive;
	}

	  class Volcano {
	    public String name;
	    // public boolean isActive; removed field
	    public Location location; // New field
	}
