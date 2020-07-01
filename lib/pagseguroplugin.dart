import 'dart:async';

import 'package:flutter/services.dart';

class PagseguroPlugin {
  static const MethodChannel _channel =
      const MethodChannel('pagseguroplugin');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
