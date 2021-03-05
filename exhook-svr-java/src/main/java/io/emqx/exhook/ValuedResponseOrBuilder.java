// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

public interface ValuedResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v1.ValuedResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.emqx.exhook.v1.ValuedResponse.ResponsedType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.emqx.exhook.v1.ValuedResponse.ResponsedType type = 1;</code>
   * @return The type.
   */
  io.emqx.exhook.ValuedResponse.ResponsedType getType();

  /**
   * <pre>
   * Boolean result, used on the 'client.authenticate', 'client.check_acl' hooks
   * </pre>
   *
   * <code>bool bool_result = 3;</code>
   * @return The boolResult.
   */
  boolean getBoolResult();

  /**
   * <pre>
   * Message result, used on the 'message.*' hooks
   * </pre>
   *
   * <code>.emqx.exhook.v1.Message message = 4;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * Message result, used on the 'message.*' hooks
   * </pre>
   *
   * <code>.emqx.exhook.v1.Message message = 4;</code>
   * @return The message.
   */
  io.emqx.exhook.Message getMessage();
  /**
   * <pre>
   * Message result, used on the 'message.*' hooks
   * </pre>
   *
   * <code>.emqx.exhook.v1.Message message = 4;</code>
   */
  io.emqx.exhook.MessageOrBuilder getMessageOrBuilder();

  public io.emqx.exhook.ValuedResponse.ValueCase getValueCase();
}