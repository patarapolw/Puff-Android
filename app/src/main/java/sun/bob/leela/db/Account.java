package sun.bob.leela.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import java.util.Objects;

/**
 * Entity mapped to table ACCOUNT.
 */
public class Account {

    private Long id;
    /** Not-null value. */
    private String name;
    private long type;
    private String account_name;
    private Boolean hide_name;
    private String name_salt;
    /** Not-null value. */
    private String salt;
    /** Not-null value. */
    private String hash;
    private String additional;
    private String add_salt;
    private long category;
    /** Not-null value. */
    private String tag;
    private Long last_access;
    private String icon;

    // KEEP FIELDS - put your custom fields here

    @Override
    public boolean equals(Object another) {
        return another instanceof Account ? ((Account) another).getId() == this.getId() : false;
    }
    // KEEP FIELDS END

    public Account() {
    }

    public Account(Long id) {
        this.id = id;
    }

    public Account(Long id, String name, long type, String account_name, Boolean hide_name, String name_salt, String salt, String hash, String additional, String add_salt, long category, String tag, Long last_access, String icon) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.account_name = account_name;
        this.hide_name = hide_name;
        this.name_salt = name_salt;
        this.salt = salt;
        this.hash = hash;
        this.additional = additional;
        this.add_salt = add_salt;
        this.category = category;
        this.tag = tag;
        this.last_access = last_access;
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public Boolean getHide_name() {
        return hide_name;
    }

    public void setHide_name(Boolean hide_name) {
        this.hide_name = hide_name;
    }

    public String getName_salt() {
        return name_salt;
    }

    public void setName_salt(String name_salt) {
        this.name_salt = name_salt;
    }

    /** Not-null value. */
    public String getSalt() {
        return salt;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /** Not-null value. */
    public String getHash() {
        return hash;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getAdd_salt() {
        return add_salt;
    }

    public void setAdd_salt(String add_salt) {
        this.add_salt = add_salt;
    }

    public long getCategory() {
        return category;
    }

    public void setCategory(long category) {
        this.category = category;
    }

    /** Not-null value. */
    public String getTag() {
        return tag;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getLast_access() {
        return last_access;
    }

    public void setLast_access(Long last_access) {
        this.last_access = last_access;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}