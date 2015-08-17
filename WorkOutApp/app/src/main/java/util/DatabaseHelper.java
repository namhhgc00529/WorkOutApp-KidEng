package util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.Calendar;
import java.util.Date;

import java.sql.SQLException;
import java.util.GregorianCalendar;

/**
 * Created by arock on 8/15/2015.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "ExerciseAppDB.s3db";
    private static final int DATABASE_VERSION = 1;

    private Dao<User, Integer> usersDAO = null;
    private RuntimeExceptionDao<User,Integer> usersRuntimeDAO = null;

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource source) {
        Log.i(DatabaseHelper.class.getSimpleName(), "onCreate");
        try {
            TableUtils.createTable(source, User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RuntimeExceptionDao<User, Integer> dao = getSimpleDataDao();

        Date date = new Date();
        Calendar c= new GregorianCalendar();
        c.add(Calendar.DATE,30);
        Date d = c.getTime();

        User u = new User(1,80,175,21,"male",26.12,3,1782.51,1.3,2317.263,75,date,d);
        dao.create(u);
        User u1 = new User(2,80,175,21,"male",26.12,3,1782.51,1.3,2317.263,75,date,d);
        dao.create(u1);
        Log.i(DatabaseHelper.class.getName(), "created new entries in onCreate: ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int i, int i1) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onUpgrade");
            TableUtils.dropTable(connectionSource, User.class, true);
            // after we drop the old databases, we create the new ones
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
            throw new RuntimeException(e);
        }
    }
    public Dao<User, Integer> getDao() throws SQLException {
        if (usersDAO == null) {
            usersDAO = getDao(User.class);
        }
        return usersDAO;
    }
    public RuntimeExceptionDao<User, Integer> getSimpleDataDao() {
        if (usersRuntimeDAO == null) {
            usersRuntimeDAO = getRuntimeExceptionDao(User.class);
        }
        return usersRuntimeDAO;
    }

    @Override
    public void close() {
        super.close();
        usersDAO = null;
        usersRuntimeDAO = null;
    }
}
