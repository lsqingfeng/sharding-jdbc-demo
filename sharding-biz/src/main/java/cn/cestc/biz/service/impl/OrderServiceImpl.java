package cn.cestc.biz.service.impl;


import cn.cestc.biz.entity.Order;
import cn.cestc.biz.mapper.OrderMapper;
import cn.cestc.biz.service.OrderService;

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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
