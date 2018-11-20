package com.pci.data.service;

import org.springframework.stereotype.Service;

import com.pci.data.entity.Dog;
import com.pci.data.util.BSUtil;
@Service
public class DogService {
	
	public Dog update(Dog dog){

        // some database options

        // 模拟狗狗新名字与其他狗狗的名字冲突
        BSUtil.isTrue(false, "狗狗名字已经被使用了...");

        // update database dog info

        return dog;
    }

}
