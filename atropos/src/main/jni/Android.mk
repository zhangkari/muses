
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := AtNative
LOCAL_SRC_FILES := AtNative.c
LOCAL_LDLIBS := -lm -llog

include $(BUILD_SHARED_LIBRARY)