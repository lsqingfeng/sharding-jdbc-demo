package cn.cestc.biz.service.impl;

import cn.cestc.biz.entity.OrderItem;
import cn.cestc.biz.mapper.OrderItemMapper;
import cn.cestc.biz.service.OrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
