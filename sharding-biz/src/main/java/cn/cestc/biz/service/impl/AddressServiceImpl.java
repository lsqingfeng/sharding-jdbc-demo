package cn.cestc.biz.service.impl;

import cn.cestc.biz.entity.Address;
import cn.cestc.biz.mapper.AddressMapper;
import cn.cestc.biz.service.AddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

}
