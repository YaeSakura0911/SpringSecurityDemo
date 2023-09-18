package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_role_user")
public class RoleUser {
    private Long id;
    private Long userId;
    private Long roleId;
}
