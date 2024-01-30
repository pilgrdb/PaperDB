Sorry for inconvenience....
Keep up to date.
Please use our latest sdk 4.2.2 for null point exception.

Runtime exception error solve.

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
	        implementation 'com.github.pilgrdb:PaperDB:4.2.2'
	}

 -Kotlin Dls
 
	 dependencies {
		        implementation ("com.github.pilgrdb:PaperDB:4.2.2")
		}

Initialize Paper
Should be initialized once in Application.onCreate():

	io.pilgrdb.paperdb.Paper.init(context);


New :
- String converter
- Url maker

- StringConverters.convert("Your String");
- UrlConverters.convert("Your Url");

Threading
Should be initialized once in Application.onCreate():
-Paper.init() should be called in UI thread;
-All other APIs (write, read etc.) are thread-safe and obviously must be called outside of UI thread. Reading/writing for different keys can be done in parallel.


Save

Save any object, Map, List, HashMap etc. including all internal objects. Use your existing data classes as is. Note that key is used as file name to store the data and so cannot contain symbols like /..

	List<Person> contacts = ...
	Paper.book().write("contacts", contacts);

 Read
 Read data objects is as easy as
 
	 List<Person> = Paper.book().read("contacts");

the instantiated class is exactly the one used to save data. Limited changes to the class structure are handled automatically.

Use default values if object doesn't exist in the storage.

	List<Person> = Paper.book().read("contacts", new ArrayList<>());

 Delete
 Delete data for one key.

	Paper.book().delete("contacts");

Remove all keys for the given Book. Paper.init() must be called prior calling destroy().

	Paper.book().destroy();

 Use custom book

You can create custom Book with separate storage using

	Paper.book("for-user-1").write("contacts", contacts);
	Paper.book("for-user-2").write("contacts", contacts);

 Get all keys
Returns all keys for objects in the book.

	List<String> allKeys = Paper.book().getAllKeys();

How it works

Paper is based on the following assumptions:

- Datasets on mobile devices are small and usually don't have relations in between;
- Random file access on flash storage is very fast;
- 
Paper saves each object for given key in a separate file and every write/read operations write/read the whole file.

The Kryo is used for object graph serialization and to provide data compatibility support.

Each book is located in a separate file folder.


Limitations
- Circular references are not supported

Apps using Paper
- AppDialer – Paper initially has been developed as internal lib to reduce start up time for AppDialer. Currently AppDialer has the best start up time in its class. And simple no-sql-pain data storage layer like a bonus.
- Busmap - This application provide all things you need for travelling by bus in Ho Chi Minh city, Vietnam. While the source code is not opened, it is found that the application use Paper internally to manange the bus stop data, route data, time data,... and more.

License

Copyright 2015 Aleksey Masny

	Licensed under the Apache License, Version 4.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	   http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.


All Functions example...

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
