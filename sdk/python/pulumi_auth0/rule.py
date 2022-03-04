# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RuleArgs', 'Rule']

@pulumi.input_type
class RuleArgs:
    def __init__(__self__, *,
                 script: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 order: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Rule resource.
        :param pulumi.Input[str] script: String. Code to be executed when the rule runs.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether the rule is enabled.
        :param pulumi.Input[str] name: String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        :param pulumi.Input[int] order: Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        """
        pulumi.set(__self__, "script", script)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if order is not None:
            pulumi.set(__self__, "order", order)

    @property
    @pulumi.getter
    def script(self) -> pulumi.Input[str]:
        """
        String. Code to be executed when the rule runs.
        """
        return pulumi.get(self, "script")

    @script.setter
    def script(self, value: pulumi.Input[str]):
        pulumi.set(self, "script", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether the rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[int]]:
        """
        Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "order", value)


@pulumi.input_type
class _RuleState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 order: Optional[pulumi.Input[int]] = None,
                 script: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Rule resources.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether the rule is enabled.
        :param pulumi.Input[str] name: String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        :param pulumi.Input[int] order: Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        :param pulumi.Input[str] script: String. Code to be executed when the rule runs.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if script is not None:
            pulumi.set(__self__, "script", script)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether the rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[int]]:
        """
        Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "order", value)

    @property
    @pulumi.getter
    def script(self) -> Optional[pulumi.Input[str]]:
        """
        String. Code to be executed when the rule runs.
        """
        return pulumi.get(self, "script")

    @script.setter
    def script(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "script", value)


class Rule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 order: Optional[pulumi.Input[int]] = None,
                 script: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your
        authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage rules.
        You can create global variable for use with rules by using the RuleConfig resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_rule = auth0.Rule("myRule",
            enabled=True,
            script=\"\"\"function (user, context, callback) {
          callback(null, user, context);
        }

        \"\"\")
        my_rule_config = auth0.RuleConfig("myRuleConfig",
            key="foo",
            value="bar")
        ```

        ## Import

        Existing rules can be imported using their id, e.g.

        ```sh
         $ pulumi import auth0:index/rule:Rule my_rule rul_XXXXXXXXXXXXX
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether the rule is enabled.
        :param pulumi.Input[str] name: String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        :param pulumi.Input[int] order: Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        :param pulumi.Input[str] script: String. Code to be executed when the rule runs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your
        authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage rules.
        You can create global variable for use with rules by using the RuleConfig resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_rule = auth0.Rule("myRule",
            enabled=True,
            script=\"\"\"function (user, context, callback) {
          callback(null, user, context);
        }

        \"\"\")
        my_rule_config = auth0.RuleConfig("myRuleConfig",
            key="foo",
            value="bar")
        ```

        ## Import

        Existing rules can be imported using their id, e.g.

        ```sh
         $ pulumi import auth0:index/rule:Rule my_rule rul_XXXXXXXXXXXXX
        ```

        :param str resource_name: The name of the resource.
        :param RuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 order: Optional[pulumi.Input[int]] = None,
                 script: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RuleArgs.__new__(RuleArgs)

            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["order"] = order
            if script is None and not opts.urn:
                raise TypeError("Missing required property 'script'")
            __props__.__dict__["script"] = script
        super(Rule, __self__).__init__(
            'auth0:index/rule:Rule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            order: Optional[pulumi.Input[int]] = None,
            script: Optional[pulumi.Input[str]] = None) -> 'Rule':
        """
        Get an existing Rule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether the rule is enabled.
        :param pulumi.Input[str] name: String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        :param pulumi.Input[int] order: Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        :param pulumi.Input[str] script: String. Code to be executed when the rule runs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RuleState.__new__(_RuleState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["order"] = order
        __props__.__dict__["script"] = script
        return Rule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean. Indicates whether the rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def order(self) -> pulumi.Output[int]:
        """
        Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        """
        return pulumi.get(self, "order")

    @property
    @pulumi.getter
    def script(self) -> pulumi.Output[str]:
        """
        String. Code to be executed when the rule runs.
        """
        return pulumi.get(self, "script")

