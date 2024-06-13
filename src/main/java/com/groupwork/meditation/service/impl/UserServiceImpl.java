package com.groupwork.meditation.service.impl;

import com.groupwork.meditation.entity.User;
import com.groupwork.meditation.mapper.UserMapper;
import com.groupwork.meditation.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2024-03-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
