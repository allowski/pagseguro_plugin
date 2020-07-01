package com.pagseguro.pagseguroplugin;

import androidx.annotation.NonNull;

import com.pagseguro.pagseguroplugin.domain.PaymentRequestData;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import lombok.val;

public class PagseguroPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {

    private static MethodChannel channel;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        channel = new MethodChannel(registrar.messenger(), "pagseguroplugin");
        channel.setMethodCallHandler(new PagseguroPlugin());
    }

    @Override
    public void onAttachedToEngine(@NonNull FlutterPluginBinding binding) {

    }

    @Override
    public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {

    }

    @Override
    public void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result result) {

        result.notImplemented();

    }


    void createPayment(MethodCall call, MethodChannel.Result result) {

        PaymentRequestData paymentRequestData = new PaymentRequestData();

    }

    void getInstallments(MethodCall call, MethodChannel.Result result) {

    }

}
