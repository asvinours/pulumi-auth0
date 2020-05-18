# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Rule(pulumi.CustomResource):
    enabled: pulumi.Output[bool]
    """
    Boolean. Indicates whether the rule is enabled.
    """
    name: pulumi.Output[str]
    """
    String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
    """
    order: pulumi.Output[float]
    """
    Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
    """
    script: pulumi.Output[str]
    """
    String. Code to be executed when the rule runs.
    """
    def __init__(__self__, resource_name, opts=None, enabled=None, name=None, order=None, script=None, __props__=None, __name__=None, __opts__=None):
        """
        With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage rules. You can create global variable for use with rules by using the .RuleConfig resource.

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


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether the rule is enabled.
        :param pulumi.Input[str] name: String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        :param pulumi.Input[float] order: Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        :param pulumi.Input[str] script: String. Code to be executed when the rule runs.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['enabled'] = enabled
            __props__['name'] = name
            __props__['order'] = order
            if script is None:
                raise TypeError("Missing required property 'script'")
            __props__['script'] = script
        super(Rule, __self__).__init__(
            'auth0:index/rule:Rule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, enabled=None, name=None, order=None, script=None):
        """
        Get an existing Rule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether the rule is enabled.
        :param pulumi.Input[str] name: String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
        :param pulumi.Input[float] order: Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
        :param pulumi.Input[str] script: String. Code to be executed when the rule runs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["enabled"] = enabled
        __props__["name"] = name
        __props__["order"] = order
        __props__["script"] = script
        return Rule(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

