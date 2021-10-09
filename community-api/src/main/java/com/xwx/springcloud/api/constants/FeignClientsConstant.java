package com.xwx.springcloud.api.constants;

/**
 * @author smartduan
 */
public class FeignClientsConstant {


    public static class Admin {

        public static final String APPLICATION_NAME = "cloud-biz";
        public static final String CONTEXT_ID_PREFIX = "admin-";

        public static final String TEMPLATE = CONTEXT_ID_PREFIX + "template";
        public static final String BASIC_THING_MODEL_ADMIN = CONTEXT_ID_PREFIX + "basic-thing-models-admin";
        public static final String BASIC_THING_MODEL_DRAFT_ADMIN = CONTEXT_ID_PREFIX + "basic-thing-models-draft-admin";
        public static final String BASIC_THING_MODEL_DRAFT = CONTEXT_ID_PREFIX + "basic-thing-models-draft";
        public static final String BASIC_THING_MODEL = CONTEXT_ID_PREFIX + "basic-thing-models";
        public static final String BASIC_THING_MODEL_RECYCLE_BIN = CONTEXT_ID_PREFIX + "basic-thing-models-recyclebin";
        public static final String BASIC_THING_MODEL_WORKFLOW_ADMIN = CONTEXT_ID_PREFIX + "basic-thing-models-workflow-admin";
        public static final String BASIC_THING_MODEL_WORKFLOW = CONTEXT_ID_PREFIX + "basic-thing-models-workflow";
        public static final String BASIC_THING_MODEL_TAG = CONTEXT_ID_PREFIX + "basic-thing-model-tags";

        public static final String CONFIG = CONTEXT_ID_PREFIX + "config";
        public static final String DICT = CONTEXT_ID_PREFIX + "dict";
        public static final String EXPORT = CONTEXT_ID_PREFIX + "export";
        public static final String POLICY_ATTR = CONTEXT_ID_PREFIX + "policy-attr";
        public static final String POLICY = CONTEXT_ID_PREFIX + "policy";
        public static final String POLICY_THING = CONTEXT_ID_PREFIX + "policy-thing";
        public static final String PRODUCT = CONTEXT_ID_PREFIX + "product";
        public static final String SUBSCRIBE = CONTEXT_ID_PREFIX + "subscribe";
        public static final String ATTR = CONTEXT_ID_PREFIX + "attr";
        public static final String THING_GROUP = CONTEXT_ID_PREFIX + "thing-groups";

        public static final String THING_MODEL = CONTEXT_ID_PREFIX + "thing-models";
        public static final String THING_MODEL_ADMIN = CONTEXT_ID_PREFIX + "thing-models-admin";
        public static final String THING_MODEL_DRAFT_ADMIN = CONTEXT_ID_PREFIX + "thing-models-draft-admin";
        public static final String THING_MODEL_DRAFT = CONTEXT_ID_PREFIX + "thing-models-draft";
        public static final String THING_MODEL_RECYCLE_BIN = CONTEXT_ID_PREFIX + "thing-models-recyclebin";
        public static final String THING_MODEL_WORKFLOW_ADMIN = CONTEXT_ID_PREFIX + "thing-models-workflow-admin";
        public static final String THING_MODEL_WORKFLOW = CONTEXT_ID_PREFIX + "thing-models-workflow";

        public static final String THING = CONTEXT_ID_PREFIX + "thing";
        public static final String THING_SHADOW = CONTEXT_ID_PREFIX + "thing-shadow";
        public static final String THING_TAG = CONTEXT_ID_PREFIX + "thing-tags";
        public static final String THING_METRIC = CONTEXT_ID_PREFIX + "thing-metric";
        public static final String ENTRY = CONTEXT_ID_PREFIX + "entrys";
        
        public static final String DATA_AUTH = CONTEXT_ID_PREFIX + "data-auth";
        public static final String MUTEX_CONTROL = CONTEXT_ID_PREFIX + "mutex-control";

    }

    public static class Edge {

        public static final String APPLICATION_NAME = "suiteng-iot-edge";
        public static final String CONTEXT_ID_PREFIX = "edge-";
        public static final String THING_SHADOW = CONTEXT_ID_PREFIX + "thing-shadow";
        public static final String THING_TAG = CONTEXT_ID_PREFIX + "thing-tags";
        public static final String THING_GROUP = CONTEXT_ID_PREFIX + "thing-groups";
        public static final String THING = CONTEXT_ID_PREFIX + "thing";
        public static final String THING_ALARM = CONTEXT_ID_PREFIX + "thing-alarm";
        public static final String ATTR = CONTEXT_ID_PREFIX + "attr";
        public static final String MUTEX_CONTROL = CONTEXT_ID_PREFIX + "mutex-control";

    }

    public static class OpenApi {

        public static final String APPLICATION_NAME = "suiteng-iot-openapi";
        public static final String CONTEXT_ID_PREFIX = "openapi-";
        public static final String IOT_COMMAND = CONTEXT_ID_PREFIX + "iot-command";
        public static final String POLICY = CONTEXT_ID_PREFIX + "policy";
        public static final String SUBSCRIBE = CONTEXT_ID_PREFIX + "subscribe";
        public static final String THING_GROUP = CONTEXT_ID_PREFIX + "thing-groups";
        public static final String THING_MODEL = CONTEXT_ID_PREFIX + "thing-models";
        public static final String THING = CONTEXT_ID_PREFIX + "thing";
        public static final String THING_TAG = CONTEXT_ID_PREFIX + "thing-tags";
        public static final String THING_SHADOW = CONTEXT_ID_PREFIX + "thing-shadow";
        public static final String MUTEX_CONTROL = CONTEXT_ID_PREFIX + "mutex-control";
    }

    public static class Proxy {

        public static final String APPLICATION_NAME = "suiteng-iot-proxy";
        public static final String CONTEXT_ID_PREFIX = "proxy-";
        public static final String DEVICE = CONTEXT_ID_PREFIX + "devices";
        public static final String GEO = CONTEXT_ID_PREFIX + "geos";
        public static final String PRODUCT = CONTEXT_ID_PREFIX + "products";
        public static final String WELINK_MSG_WRAPPER = CONTEXT_ID_PREFIX + "weLink-msg-wrapper";

    }

    public static class Transform {

        public static final String APPLICATION_NAME = "suiteng-iot-transform";
        public static final String CONTEXT_ID_PREFIX = "transform-";
        public static final String SYNC_DATA = CONTEXT_ID_PREFIX + "sync-data";
        public static final String THING_SHADOW = CONTEXT_ID_PREFIX + "thing-shadow";

    }

    public static class Station {

        public static final String APPLICATION_NAME = "suiteng-iot-station";
        public static final String CONTEXT_ID_PREFIX = "station-";
        public static final String COMMON = CONTEXT_ID_PREFIX + "common";
    }
}
