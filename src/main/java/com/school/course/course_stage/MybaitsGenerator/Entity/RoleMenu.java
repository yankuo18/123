package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;

public class RoleMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu.role
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu.menu_id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_menu.id
     *
     * @return the value of role_menu.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_menu.id
     *
     * @param id the value for role_menu.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_menu.role
     *
     * @return the value of role_menu.role
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_menu.role
     *
     * @param role the value for role_menu.role
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_menu.menu_id
     *
     * @return the value of role_menu.menu_id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_menu.menu_id
     *
     * @param menuId the value for role_menu.menu_id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", role=").append(role);
        sb.append(", menuId=").append(menuId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}