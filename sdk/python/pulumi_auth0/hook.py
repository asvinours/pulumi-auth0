# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['Hook']


class Hook(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 script: Optional[pulumi.Input[str]] = None,
                 trigger_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code.

        Depending on the extensibility point, you can use Hooks with Database Connections and/or Passwordless Connections.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_hook = auth0.Hook("myHook",
            enabled=True,
            script=\"\"\"function (user, context, callback) { 
          callback(null, { user }); 
        }

        \"\"\",
            trigger_id="pre-user-registration")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether the hook is enabled, or disabled
        :param pulumi.Input[str] name: Name of this hook
        :param pulumi.Input[str] script: Code to be executed when this hook runs
        :param pulumi.Input[str] trigger_id: Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['enabled'] = enabled
            __props__['name'] = name
            if script is None and not opts.urn:
                raise TypeError("Missing required property 'script'")
            __props__['script'] = script
            if trigger_id is None and not opts.urn:
                raise TypeError("Missing required property 'trigger_id'")
            __props__['trigger_id'] = trigger_id
        super(Hook, __self__).__init__(
            'auth0:index/hook:Hook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            script: Optional[pulumi.Input[str]] = None,
            trigger_id: Optional[pulumi.Input[str]] = None) -> 'Hook':
        """
        Get an existing Hook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether the hook is enabled, or disabled
        :param pulumi.Input[str] name: Name of this hook
        :param pulumi.Input[str] script: Code to be executed when this hook runs
        :param pulumi.Input[str] trigger_id: Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["enabled"] = enabled
        __props__["name"] = name
        __props__["script"] = script
        __props__["trigger_id"] = trigger_id
        return Hook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the hook is enabled, or disabled
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of this hook
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def script(self) -> pulumi.Output[str]:
        """
        Code to be executed when this hook runs
        """
        return pulumi.get(self, "script")

    @property
    @pulumi.getter(name="triggerId")
    def trigger_id(self) -> pulumi.Output[str]:
        """
        Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
        """
        return pulumi.get(self, "trigger_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

