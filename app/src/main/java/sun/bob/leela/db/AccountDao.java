package sun.bob.leela.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import sun.bob.leela.db.Account;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ACCOUNT.
*/
public class AccountDao extends AbstractDao<Account, Long> {

    public static final String TABLENAME = "ACCOUNT";

    /**
     * Properties of entity Account.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Type = new Property(2, long.class, "type", false, "TYPE");
        public final static Property Account_name = new Property(3, String.class, "account_name", false, "ACCOUNT_NAME");
        public final static Property Hide_name = new Property(4, Boolean.class, "hide_name", false, "HIDE_NAME");
        public final static Property Name_salt = new Property(5, String.class, "name_salt", false, "NAME_SALT");
        public final static Property Salt = new Property(6, String.class, "salt", false, "SALT");
        public final static Property Hash = new Property(7, String.class, "hash", false, "HASH");
        public final static Property Additional = new Property(8, String.class, "additional", false, "ADDITIONAL");
        public final static Property Add_salt = new Property(9, String.class, "add_salt", false, "ADD_SALT");
        public final static Property Category = new Property(10, long.class, "category", false, "CATEGORY");
        public final static Property Tag = new Property(11, String.class, "tag", false, "TAG");
        public final static Property Last_access = new Property(12, Long.class, "last_access", false, "LAST_ACCESS");
        public final static Property Icon = new Property(13, String.class, "icon", false, "ICON");
    };


    public AccountDao(DaoConfig config) {
        super(config);
    }
    
    public AccountDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ACCOUNT' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NAME' TEXT NOT NULL ," + // 1: name
                "'TYPE' INTEGER NOT NULL ," + // 2: type
                "'ACCOUNT_NAME' TEXT," + // 3: account_name
                "'HIDE_NAME' INTEGER," + // 4: hide_name
                "'NAME_SALT' TEXT," + // 5: name_salt
                "'SALT' TEXT NOT NULL ," + // 6: salt
                "'HASH' TEXT NOT NULL ," + // 7: hash
                "'ADDITIONAL' TEXT," + // 8: additional
                "'ADD_SALT' TEXT," + // 9: add_salt
                "'CATEGORY' INTEGER NOT NULL ," + // 10: category
                "'TAG' TEXT NOT NULL ," + // 11: tag
                "'LAST_ACCESS' INTEGER," + // 12: last_access
                "'ICON' TEXT);"); // 13: icon
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ACCOUNT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Account entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getName());
        stmt.bindLong(3, entity.getType());
 
        String account_name = entity.getAccount_name();
        if (account_name != null) {
            stmt.bindString(4, account_name);
        }
 
        Boolean hide_name = entity.getHide_name();
        if (hide_name != null) {
            stmt.bindLong(5, hide_name ? 1l: 0l);
        }
 
        String name_salt = entity.getName_salt();
        if (name_salt != null) {
            stmt.bindString(6, name_salt);
        }
        stmt.bindString(7, entity.getSalt());
        stmt.bindString(8, entity.getHash());
 
        String additional = entity.getAdditional();
        if (additional != null) {
            stmt.bindString(9, additional);
        }
 
        String add_salt = entity.getAdd_salt();
        if (add_salt != null) {
            stmt.bindString(10, add_salt);
        }
        stmt.bindLong(11, entity.getCategory());
        stmt.bindString(12, entity.getTag());
 
        Long last_access = entity.getLast_access();
        if (last_access != null) {
            stmt.bindLong(13, last_access);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(14, icon);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Account readEntity(Cursor cursor, int offset) {
        Account entity = new Account( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // name
            cursor.getLong(offset + 2), // type
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // account_name
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // hide_name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // name_salt
            cursor.getString(offset + 6), // salt
            cursor.getString(offset + 7), // hash
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // additional
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // add_salt
            cursor.getLong(offset + 10), // category
            cursor.getString(offset + 11), // tag
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // last_access
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13) // icon
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Account entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setType(cursor.getLong(offset + 2));
        entity.setAccount_name(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setHide_name(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setName_salt(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSalt(cursor.getString(offset + 6));
        entity.setHash(cursor.getString(offset + 7));
        entity.setAdditional(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAdd_salt(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setCategory(cursor.getLong(offset + 10));
        entity.setTag(cursor.getString(offset + 11));
        entity.setLast_access(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setIcon(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Account entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Account entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
