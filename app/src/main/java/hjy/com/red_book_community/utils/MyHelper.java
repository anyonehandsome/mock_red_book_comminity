package hjy.com.red_book_community.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
    public MyHelper(Context context) {
        super(context, "privateTourGuide.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE articles(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "writerId INTEGER," +
                "title NVARCHAR(30)," +
                "content TEXT," +
                "postTime DATE DEFAULT CURRENT_TIMESTAMP," +
                "likeNumber INTEGER DEFAULT 0)");
        db.execSQL("CREATE TABLE articlesImages(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "articleId INTEGER," +
                "image1 VARCHAR(256),  " +
                "image2 VARCHAR(256)," +
                "image3 VARCHAR(256))");
        db.execSQL("CREATE TABLE user(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name NVARCHAR(20),  " +
                "password VARCHAR(256)," +
                "avatar VARCHAR(256)," +
                "sex CHAR(2)," +
                "age INTEGER," +
                "phone VARCHAR(11))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}