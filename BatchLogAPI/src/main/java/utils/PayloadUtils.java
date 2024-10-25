package utils;

import entity.PayloadEntity;
import org.openapitools.model.LogPostRequest;

public class PayloadUtils {
    public static PayloadEntity createPopulatePayloadEntity(LogPostRequest logPostRequest) {
        PayloadEntity payload = new PayloadEntity();

        payload.setIdPol(logPostRequest.getActualPayload().getIdPol());
        payload.setCdescr(logPostRequest.getActualPayload().getCdescr());
        payload.setDexpcur(logPostRequest.getActualPayload().getDexpcur());
        payload.setCplate(logPostRequest.getActualPayload().getCplate());
        payload.setCbrand(logPostRequest.getActualPayload().getCbrand());
        payload.setCmodel(logPostRequest.getActualPayload().getCmodel());
        payload.setCver(logPostRequest.getActualPayload().getCver());

        return payload;
    }
}
