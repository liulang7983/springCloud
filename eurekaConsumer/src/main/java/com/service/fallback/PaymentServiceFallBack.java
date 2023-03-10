package com.service.fallback;

import bean.CommonResult;
import bean.Payment;
import com.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author ming.li
 * @date 2023/3/10 14:32
 */
@Component
public class PaymentServiceFallBack implements PaymentService {
    @Override
    public CommonResult create(Payment payment) {
        return new CommonResult(304,"触发了熔断");
    }

    @Override
    public CommonResult getId(Long id) {
        return new CommonResult(304,"触发了熔断");
    }

    @Override
    public CommonResult timeOut() {
        return new CommonResult(304,"触发了熔断");
    }
}
