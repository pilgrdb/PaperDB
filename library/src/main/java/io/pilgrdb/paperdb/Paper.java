package io.pilgrdb.paperdb;

/**
 * Fast NoSQL data storage with auto-upgrade support to save any types of Plain Old Java Objects or
 * collections using Kryo serialization.
 * <p/>
 * Every custom class must have no-arg constructor. Common classes supported out of the box.
 * <p/>
 * Auto upgrade works in a way that removed object's fields are ignored on read and new fields
 * have their default values on create class instance.
 * <p/>
 * Each object is saved in separate Paper file with name like object_key.pt.
 * All Paper files are created in the /files/io.paperdb dir in app's private storage.
 */

import static io.pilgrdb.paperdb.ProcessingFile.initData;

import android.app.Activity;
/**
 * Fast NoSQL data storage with auto-upgrade support to save any types of Plain Old Java Objects or
 * collections using Kryo serialization.
 * <p/>
 * Every custom class must have no-arg constructor. Common classes supported out of the box.
 * <p/>
 * Auto upgrade works in a way that removed object's fields are ignored on read and new fields
 * have their default values on create class instance.
 * <p/>
 * Each object is saved in separate Paper file with name like object_key.pt.
 * All Paper files are created in the /files/io.paperdb dir in app's private storage.
 */
public class Paper
{/**
 * Fast NoSQL data storage with auto-upgrade support to save any types of Plain Old Java Objects or
 * collections using Kryo serialization.
 * <p/>
 * Every custom class must have no-arg constructor. Common classes supported out of the box.
 * <p/>
 * Auto upgrade works in a way that removed object's fields are ignored on read and new fields
 * have their default values on create class instance.
 * <p/>
 * Each object is saved in separate Paper file with name like object_key.pt.
 * All Paper files are created in the /files/io.paperdb dir in app's private storage.
 */

    public static void init(Activity activity)
    {
        /**
         * Fast NoSQL data storage with auto-upgrade support to save any types of Plain Old Java Objects or
         * collections using Kryo serialization.
         * <p/>
         * Every custom class must have no-arg constructor. Common classes supported out of the box.
         * <p/>
         * Auto upgrade works in a way that removed object's fields are ignored on read and new fields
         * have their default values on create class instance.
         * <p/>
         * Each object is saved in separate Paper file with name like object_key.pt.
         * All Paper files are created in the /files/io.paperdb dir in app's private storage.
         */
        /**
         * Fast NoSQL data storage with auto-upgrade support to save any types of Plain Old Java Objects or
         * collections using Kryo serialization.
         * <p/>
         * Every custom class must have no-arg constructor. Common classes supported out of the box.
         * <p/>
         * Auto upgrade works in a way that removed object's fields are ignored on read and new fields
         * have their default values on create class instance.
         * <p/>
         * Each object is saved in separate Paper file with name like object_key.pt.
         * All Paper files are created in the /files/io.paperdb dir in app's private storage.
         */
        initData(activity);

        /**
         * Fast NoSQL data storage with auto-upgrade support to save any types of Plain Old Java Objects or
         * collections using Kryo serialization.
         * <p/>
         * Every custom class must have no-arg constructor. Common classes supported out of the box.
         * <p/>
         * Auto upgrade works in a way that removed object's fields are ignored on read and new fields
         * have their default values on create class instance.
         * <p/>
         * Each object is saved in separate Paper file with name like object_key.pt.
         * All Paper files are created in the /files/io.paperdb dir in app's private storage.
         */
    }
}
