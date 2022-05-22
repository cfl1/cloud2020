package com.chen.springcloud.servicer;

/**
 * @author chenfl
 * @create 2021-01-20-10:48
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
