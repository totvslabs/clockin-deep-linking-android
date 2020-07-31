//
//  VisionModule.m
//  TOTVSClockInVision
//
//  Created by Jansel Rodriguez on 7/27/20.
//  Copyright © 2020 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <React/RCTViewManager.h>

@interface RCT_EXTERN_MODULE(VisionBarcodeCameraViewManager, RCTViewManager)

    RCT_EXPORT_VIEW_PROPERTY(facing, NSNumber)
    RCT_EXPORT_VIEW_PROPERTY(zoom, NSNumber)

    RCT_EXTERN_METHOD(
        setZoom:(nonnull NSNumber*)zoom
        node:(nonnull NSNumber*)node
        resolve: (RCTPromiseResolveBlock)resolve
        reject: (RCTPromiseRejectBlock)reject
    )
    RCT_EXTERN_METHOD(
        getZoom:(nonnull NSNumber*)node
        resolve: (RCTPromiseResolveBlock)resolve
        reject: (RCTPromiseRejectBlock)reject
    )

    RCT_EXTERN_METHOD(
        enableTorch:(BOOL)enabled
        node:(nonnull NSNumber*)enabled
        resolve: (RCTPromiseResolveBlock)resolve
        reject: (RCTPromiseRejectBlock)reject
    )
    RCT_EXTERN_METHOD(
        isTorchEnabled:(nonnull NSNumber*)node
        resolve: (RCTPromiseResolveBlock)resolve
        reject: (RCTPromiseRejectBlock)reject
    )

    RCT_EXTERN_METHOD(
        toggleCamera:(nonnull NSNumber*)node
        resolve: (RCTPromiseResolveBlock)resolve
        reject: (RCTPromiseRejectBlock)reject
    )

    RCT_EXTERN_METHOD(
        setLensFacing:(nonnull NSNumber*)facing
        node:(nonnull NSNumber*)node
        resolve: (RCTPromiseResolveBlock)resolve
        reject: (RCTPromiseRejectBlock)reject
    )
    RCT_EXTERN_METHOD(
        getLensFacing:(nonnull NSNumber*)node
        resolve: (RCTPromiseResolveBlock)resolve
        reject: (RCTPromiseRejectBlock)reject
    )
@end
