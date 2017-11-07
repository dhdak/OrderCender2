package com.bonc.purchase.v2.model.service.impl;

import com.bonc.purchase.v2.model.PurchaseResponse;
import com.bonc.purchase.v2.model.dto.Product;
import com.bonc.purchase.v2.model.dto.ProductDto;
import com.bonc.purchase.v2.model.service.OrderService;
import com.bonc.purchase.v2.model.type.SystemCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderFlowFor4GService implements OrderService{

    private static final Logger log = LoggerFactory.getLogger(OrderFlowFor4GService.class);


    @Override
    public PurchaseResponse handle(Map productMap){
        System.out.println("aaa");

        return null;
    }

//    public PurchaseResponse orderFlowFor4G(ProductDto productDto, int time) {
//        log.debug("productDto：{}", productDto);
//        String httpResponse;
//        String dateString;
//        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//        dateString = format.format(new Date());
//        PurchaseProperties.Order4G order4G =new PurchaseProperties.Order4G();
//        Map paramsMap = new HashMap();
//        paramsMap.put("serialNumber",productDto.getUserInfoDto().getMobile());
//        paramsMap.put("city", productDto.getUserInfoDto().getCityCode());
//        paramsMap.put("ordersId", paramsMap.get("serialNumber") + "_" + dateString);
//        paramsMap.put("operatorId", productDto.getOperator().getOperatorId());
//        List<Product> products = productDto.getProducts();
//        PurchaseResponse purchaseResponse = PurchaseResponse.of(SystemCodeEnum.PRODUCT_NULL);
//        for(Product product:products){
//            paramsMap.put("flowId",product.getInterfaceProductId());
//            httpResponse= UnicomBusi.order(paramsMap,order4G);
//            log.debug("根据产品信息product：{}调用能力开放平台返回结果httpResponse：{}",product,httpResponse);
//            if (httpResponse != null && httpResponse.trim().length()>=2){
//                Unicom4GResponse unicom4GResponse = jsonMapper.fromJson(httpResponse, Unicom4GResponse.class);
//                if (unicom4GResponse.getResult()!=null){
//                    if ("0".equals(unicom4GResponse.getResult().getMsgFlag())){
//                        purchaseResponse = PurchaseResponse.of(SystemCodeEnum.CODE_SUCCESS);
//                        purchaseResponse.setMsg(purchaseResponse.getMsg()+unicom4GResponse.getResult());
//                        return purchaseResponse;
//                    }else if("1".equals(unicom4GResponse.getResult().getMsgFlag())){
//                        purchaseResponse = PurchaseResponse.of(SystemCodeEnum.ORDER_FAIL);//订购失败，调用接口成功，接口返回错误
//                        purchaseResponse.setMsg(purchaseResponse.getMsg()+unicom4GResponse.getResult());
//                    }else {
//                        purchaseResponse = PurchaseResponse.of(SystemCodeEnum.ORDER_FAIL);//订购失败，调用接口成功，接口返回错误
//                        purchaseResponse.setMsg(purchaseResponse.getMsg()+unicom4GResponse.getResult());
//                    }
//                }else if("20308".equals(unicom4GResponse.getRespCode())||"20309".equals(unicom4GResponse.getRespCode())){
//                    if(time<1){
//                        purchaseResponse = PurchaseResponse.of(SystemCodeEnum.ORDER_FAIL);//订购失败，调用接口成功，接口返回错误
//                        purchaseResponse.setMsg(purchaseResponse.getMsg()+unicom4GResponse.getResult());
//                    }else {
//                        AccessTokenUtils.getAccessToken("cb",true);//强制刷新token
//                        orderFlowFor4G(productDto,time-1);
//                    }
//                }else {
//                    purchaseResponse = PurchaseResponse.of(SystemCodeEnum.ORDER_FAIL);//订购失败，调用接口成功，接口返回错误
//                    purchaseResponse.setMsg(purchaseResponse.getMsg()+unicom4GResponse.getResult());
//                }
//            }else {
//                purchaseResponse = PurchaseResponse.of(SystemCodeEnum.ORDER_FAIL);//订购失败，调用接口成功，接口返回错误
//                purchaseResponse.setMsg(purchaseResponse.getMsg()+"4G能力平台接口无返回信息");
//            }
//            if(StringUtils.equals(product.getIsWhile(),"1")){
//                continue;
//            }
//        }
//        return purchaseResponse;
//    }

}
