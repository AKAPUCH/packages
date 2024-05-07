// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// Autogenerated from Pigeon (v11.0.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.localauth;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class Messages {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<Object>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
          "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  /** Possible outcomes of an authentication attempt. */
  public enum AuthResult {
    /** The user authenticated successfully. */
    SUCCESS(0),
    /** The user failed to successfully authenticate. */
    FAILURE(1),
    /** An authentication was already in progress. */
    ERROR_ALREADY_IN_PROGRESS(2),
    /** There is no foreground activity. */
    ERROR_NO_ACTIVITY(3),
    /** The foreground activity is not a FragmentActivity. */
    ERROR_NOT_FRAGMENT_ACTIVITY(4),
    /** The authentication system was not available. */
    ERROR_NOT_AVAILABLE(5),
    /** No biometrics are enrolled. */
    ERROR_NOT_ENROLLED(6),
    /** The user is locked out temporarily due to too many failed attempts. */
    ERROR_LOCKED_OUT_TEMPORARILY(7),
    /** The user is locked out until they log in another way due to too many failed attempts. */
    ERROR_LOCKED_OUT_PERMANENTLY(8),

    ERROR_USER_CANCELED(9);

    final int index;

    private AuthResult(final int index) {
      this.index = index;
    }
  }

  /** Pigeon equivalent of the subset of BiometricType used by Android. */
  public enum AuthClassification {
    WEAK(0),
    STRONG(1);

    final int index;

    private AuthClassification(final int index) {
      this.index = index;
    }
  }

  /**
   * Pigeon version of AndroidAuthStrings, plus the authorization reason.
   *
   * <p>See auth_messages_android.dart for details.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class AuthStrings {
    private @NonNull String reason;

    public @NonNull String getReason() {
      return reason;
    }

    public void setReason(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"reason\" is null.");
      }
      this.reason = setterArg;
    }

    private @NonNull String biometricHint;

    public @NonNull String getBiometricHint() {
      return biometricHint;
    }

    public void setBiometricHint(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"biometricHint\" is null.");
      }
      this.biometricHint = setterArg;
    }

    private @NonNull String biometricNotRecognized;

    public @NonNull String getBiometricNotRecognized() {
      return biometricNotRecognized;
    }

    public void setBiometricNotRecognized(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"biometricNotRecognized\" is null.");
      }
      this.biometricNotRecognized = setterArg;
    }

    private @NonNull String biometricRequiredTitle;

    public @NonNull String getBiometricRequiredTitle() {
      return biometricRequiredTitle;
    }

    public void setBiometricRequiredTitle(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"biometricRequiredTitle\" is null.");
      }
      this.biometricRequiredTitle = setterArg;
    }

    private @NonNull String cancelButton;

    public @NonNull String getCancelButton() {
      return cancelButton;
    }

    public void setCancelButton(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"cancelButton\" is null.");
      }
      this.cancelButton = setterArg;
    }

    private @NonNull String deviceCredentialsRequiredTitle;

    public @NonNull String getDeviceCredentialsRequiredTitle() {
      return deviceCredentialsRequiredTitle;
    }

    public void setDeviceCredentialsRequiredTitle(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException(
            "Nonnull field \"deviceCredentialsRequiredTitle\" is null.");
      }
      this.deviceCredentialsRequiredTitle = setterArg;
    }

    private @NonNull String deviceCredentialsSetupDescription;

    public @NonNull String getDeviceCredentialsSetupDescription() {
      return deviceCredentialsSetupDescription;
    }

    public void setDeviceCredentialsSetupDescription(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException(
            "Nonnull field \"deviceCredentialsSetupDescription\" is null.");
      }
      this.deviceCredentialsSetupDescription = setterArg;
    }

    private @NonNull String goToSettingsButton;

    public @NonNull String getGoToSettingsButton() {
      return goToSettingsButton;
    }

    public void setGoToSettingsButton(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"goToSettingsButton\" is null.");
      }
      this.goToSettingsButton = setterArg;
    }

    private @NonNull String goToSettingsDescription;

    public @NonNull String getGoToSettingsDescription() {
      return goToSettingsDescription;
    }

    public void setGoToSettingsDescription(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"goToSettingsDescription\" is null.");
      }
      this.goToSettingsDescription = setterArg;
    }

    private @NonNull String signInTitle;

    public @NonNull String getSignInTitle() {
      return signInTitle;
    }

    public void setSignInTitle(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"signInTitle\" is null.");
      }
      this.signInTitle = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    AuthStrings() {}

    public static final class Builder {

      private @Nullable String reason;

      public @NonNull Builder setReason(@NonNull String setterArg) {
        this.reason = setterArg;
        return this;
      }

      private @Nullable String biometricHint;

      public @NonNull Builder setBiometricHint(@NonNull String setterArg) {
        this.biometricHint = setterArg;
        return this;
      }

      private @Nullable String biometricNotRecognized;

      public @NonNull Builder setBiometricNotRecognized(@NonNull String setterArg) {
        this.biometricNotRecognized = setterArg;
        return this;
      }

      private @Nullable String biometricRequiredTitle;

      public @NonNull Builder setBiometricRequiredTitle(@NonNull String setterArg) {
        this.biometricRequiredTitle = setterArg;
        return this;
      }

      private @Nullable String cancelButton;

      public @NonNull Builder setCancelButton(@NonNull String setterArg) {
        this.cancelButton = setterArg;
        return this;
      }

      private @Nullable String deviceCredentialsRequiredTitle;

      public @NonNull Builder setDeviceCredentialsRequiredTitle(@NonNull String setterArg) {
        this.deviceCredentialsRequiredTitle = setterArg;
        return this;
      }

      private @Nullable String deviceCredentialsSetupDescription;

      public @NonNull Builder setDeviceCredentialsSetupDescription(@NonNull String setterArg) {
        this.deviceCredentialsSetupDescription = setterArg;
        return this;
      }

      private @Nullable String goToSettingsButton;

      public @NonNull Builder setGoToSettingsButton(@NonNull String setterArg) {
        this.goToSettingsButton = setterArg;
        return this;
      }

      private @Nullable String goToSettingsDescription;

      public @NonNull Builder setGoToSettingsDescription(@NonNull String setterArg) {
        this.goToSettingsDescription = setterArg;
        return this;
      }

      private @Nullable String signInTitle;

      public @NonNull Builder setSignInTitle(@NonNull String setterArg) {
        this.signInTitle = setterArg;
        return this;
      }

      public @NonNull AuthStrings build() {
        AuthStrings pigeonReturn = new AuthStrings();
        pigeonReturn.setReason(reason);
        pigeonReturn.setBiometricHint(biometricHint);
        pigeonReturn.setBiometricNotRecognized(biometricNotRecognized);
        pigeonReturn.setBiometricRequiredTitle(biometricRequiredTitle);
        pigeonReturn.setCancelButton(cancelButton);
        pigeonReturn.setDeviceCredentialsRequiredTitle(deviceCredentialsRequiredTitle);
        pigeonReturn.setDeviceCredentialsSetupDescription(deviceCredentialsSetupDescription);
        pigeonReturn.setGoToSettingsButton(goToSettingsButton);
        pigeonReturn.setGoToSettingsDescription(goToSettingsDescription);
        pigeonReturn.setSignInTitle(signInTitle);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(10);
      toListResult.add(reason);
      toListResult.add(biometricHint);
      toListResult.add(biometricNotRecognized);
      toListResult.add(biometricRequiredTitle);
      toListResult.add(cancelButton);
      toListResult.add(deviceCredentialsRequiredTitle);
      toListResult.add(deviceCredentialsSetupDescription);
      toListResult.add(goToSettingsButton);
      toListResult.add(goToSettingsDescription);
      toListResult.add(signInTitle);
      return toListResult;
    }

    static @NonNull AuthStrings fromList(@NonNull ArrayList<Object> list) {
      AuthStrings pigeonResult = new AuthStrings();
      Object reason = list.get(0);
      pigeonResult.setReason((String) reason);
      Object biometricHint = list.get(1);
      pigeonResult.setBiometricHint((String) biometricHint);
      Object biometricNotRecognized = list.get(2);
      pigeonResult.setBiometricNotRecognized((String) biometricNotRecognized);
      Object biometricRequiredTitle = list.get(3);
      pigeonResult.setBiometricRequiredTitle((String) biometricRequiredTitle);
      Object cancelButton = list.get(4);
      pigeonResult.setCancelButton((String) cancelButton);
      Object deviceCredentialsRequiredTitle = list.get(5);
      pigeonResult.setDeviceCredentialsRequiredTitle((String) deviceCredentialsRequiredTitle);
      Object deviceCredentialsSetupDescription = list.get(6);
      pigeonResult.setDeviceCredentialsSetupDescription((String) deviceCredentialsSetupDescription);
      Object goToSettingsButton = list.get(7);
      pigeonResult.setGoToSettingsButton((String) goToSettingsButton);
      Object goToSettingsDescription = list.get(8);
      pigeonResult.setGoToSettingsDescription((String) goToSettingsDescription);
      Object signInTitle = list.get(9);
      pigeonResult.setSignInTitle((String) signInTitle);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class AuthOptions {
    private @NonNull Boolean biometricOnly;

    public @NonNull Boolean getBiometricOnly() {
      return biometricOnly;
    }

    public void setBiometricOnly(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"biometricOnly\" is null.");
      }
      this.biometricOnly = setterArg;
    }

    private @NonNull Boolean sensitiveTransaction;

    public @NonNull Boolean getSensitiveTransaction() {
      return sensitiveTransaction;
    }

    public void setSensitiveTransaction(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"sensitiveTransaction\" is null.");
      }
      this.sensitiveTransaction = setterArg;
    }

    private @NonNull Boolean sticky;

    public @NonNull Boolean getSticky() {
      return sticky;
    }

    public void setSticky(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"sticky\" is null.");
      }
      this.sticky = setterArg;
    }

    private @NonNull Boolean useErrorDialgs;

    public @NonNull Boolean getUseErrorDialgs() {
      return useErrorDialgs;
    }

    public void setUseErrorDialgs(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"useErrorDialgs\" is null.");
      }
      this.useErrorDialgs = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    AuthOptions() {}

    public static final class Builder {

      private @Nullable Boolean biometricOnly;

      public @NonNull Builder setBiometricOnly(@NonNull Boolean setterArg) {
        this.biometricOnly = setterArg;
        return this;
      }

      private @Nullable Boolean sensitiveTransaction;

      public @NonNull Builder setSensitiveTransaction(@NonNull Boolean setterArg) {
        this.sensitiveTransaction = setterArg;
        return this;
      }

      private @Nullable Boolean sticky;

      public @NonNull Builder setSticky(@NonNull Boolean setterArg) {
        this.sticky = setterArg;
        return this;
      }

      private @Nullable Boolean useErrorDialgs;

      public @NonNull Builder setUseErrorDialgs(@NonNull Boolean setterArg) {
        this.useErrorDialgs = setterArg;
        return this;
      }

      public @NonNull AuthOptions build() {
        AuthOptions pigeonReturn = new AuthOptions();
        pigeonReturn.setBiometricOnly(biometricOnly);
        pigeonReturn.setSensitiveTransaction(sensitiveTransaction);
        pigeonReturn.setSticky(sticky);
        pigeonReturn.setUseErrorDialgs(useErrorDialgs);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(4);
      toListResult.add(biometricOnly);
      toListResult.add(sensitiveTransaction);
      toListResult.add(sticky);
      toListResult.add(useErrorDialgs);
      return toListResult;
    }

    static @NonNull AuthOptions fromList(@NonNull ArrayList<Object> list) {
      AuthOptions pigeonResult = new AuthOptions();
      Object biometricOnly = list.get(0);
      pigeonResult.setBiometricOnly((Boolean) biometricOnly);
      Object sensitiveTransaction = list.get(1);
      pigeonResult.setSensitiveTransaction((Boolean) sensitiveTransaction);
      Object sticky = list.get(2);
      pigeonResult.setSticky((Boolean) sticky);
      Object useErrorDialgs = list.get(3);
      pigeonResult.setUseErrorDialgs((Boolean) useErrorDialgs);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class AuthClassificationWrapper {
    private @NonNull AuthClassification value;

    public @NonNull AuthClassification getValue() {
      return value;
    }

    public void setValue(@NonNull AuthClassification setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"value\" is null.");
      }
      this.value = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    AuthClassificationWrapper() {}

    public static final class Builder {

      private @Nullable AuthClassification value;

      public @NonNull Builder setValue(@NonNull AuthClassification setterArg) {
        this.value = setterArg;
        return this;
      }

      public @NonNull AuthClassificationWrapper build() {
        AuthClassificationWrapper pigeonReturn = new AuthClassificationWrapper();
        pigeonReturn.setValue(value);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(1);
      toListResult.add(value == null ? null : value.index);
      return toListResult;
    }

    static @NonNull AuthClassificationWrapper fromList(@NonNull ArrayList<Object> list) {
      AuthClassificationWrapper pigeonResult = new AuthClassificationWrapper();
      Object value = list.get(0);
      pigeonResult.setValue(AuthClassification.values()[(int) value]);
      return pigeonResult;
    }
  }

  public interface Result<T> {
    @SuppressWarnings("UnknownNullness")
    void success(T result);

    void error(@NonNull Throwable error);
  }

  private static class LocalAuthApiCodec extends StandardMessageCodec {
    public static final LocalAuthApiCodec INSTANCE = new LocalAuthApiCodec();

    private LocalAuthApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return AuthClassificationWrapper.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 129:
          return AuthOptions.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 130:
          return AuthStrings.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof AuthClassificationWrapper) {
        stream.write(128);
        writeValue(stream, ((AuthClassificationWrapper) value).toList());
      } else if (value instanceof AuthOptions) {
        stream.write(129);
        writeValue(stream, ((AuthOptions) value).toList());
      } else if (value instanceof AuthStrings) {
        stream.write(130);
        writeValue(stream, ((AuthStrings) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface LocalAuthApi {
    /** Returns true if this device supports authentication. */
    @NonNull
    Boolean isDeviceSupported();
    /**
     * Returns true if this device can support biometric authentication, whether any biometrics are
     * enrolled or not.
     */
    @NonNull
    Boolean deviceCanSupportBiometrics();
    /**
     * Cancels any in-progress authentication.
     *
     * <p>Returns true only if authentication was in progress, and was successfully cancelled.
     */
    @NonNull
    Boolean stopAuthentication();
    /**
     * Returns the biometric types that are enrolled, and can thus be used without additional setup.
     */
    @NonNull
    List<AuthClassificationWrapper> getEnrolledBiometrics();
    /**
     * Attempts to authenticate the user with the provided [options], and using [strings] for any
     * UI.
     */
    void authenticate(
        @NonNull AuthOptions options,
        @NonNull AuthStrings strings,
        @NonNull Result<AuthResult> result);

    /** The codec used by LocalAuthApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return LocalAuthApiCodec.INSTANCE;
    }
    /** Sets up an instance of `LocalAuthApi` to handle messages through the `binaryMessenger`. */
    static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable LocalAuthApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.local_auth_android.LocalAuthApi.isDeviceSupported",
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.isDeviceSupported();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.local_auth_android.LocalAuthApi.deviceCanSupportBiometrics",
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.deviceCanSupportBiometrics();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.local_auth_android.LocalAuthApi.stopAuthentication",
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.stopAuthentication();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.local_auth_android.LocalAuthApi.getEnrolledBiometrics",
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  List<AuthClassificationWrapper> output = api.getEnrolledBiometrics();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.local_auth_android.LocalAuthApi.authenticate",
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                AuthOptions optionsArg = (AuthOptions) args.get(0);
                AuthStrings stringsArg = (AuthStrings) args.get(1);
                Result<AuthResult> resultCallback =
                    new Result<AuthResult>() {
                      public void success(AuthResult result) {
                        wrapped.add(0, result.index);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.authenticate(optionsArg, stringsArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
}
