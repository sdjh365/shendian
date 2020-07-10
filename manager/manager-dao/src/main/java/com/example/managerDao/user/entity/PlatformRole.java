package com.example.managerDao.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author jobob
 * @since 2020-07-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PlatformRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "roleId", type = IdType.AUTO)
    private Integer roleId;

    /**
     * 角色名称
     */
    @TableField("roleName")
    private String roleName;

    /**
     * 备注
     */
    private String note;


}
