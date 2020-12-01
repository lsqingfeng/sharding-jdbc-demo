package cn.cestc.biz.service.impl;

import cn.cestc.biz.entity.User;
import cn.cestc.biz.mapper.UserMapper;
import cn.cestc.biz.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liushuai
 * @since 2020-09-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
