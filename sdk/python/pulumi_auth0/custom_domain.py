# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['CustomDomain']


class CustomDomain(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 verification_method: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        With Auth0, you can use a custom domain to maintain a consistent user experience. This resource allows you to create and manage a custom domain within your Auth0 tenant.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_custom_domain = auth0.CustomDomain("myCustomDomain",
            domain="auth.example.com",
            type="auth0_managed_certs",
            verification_method="txt")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: String. Name of the custom domain.
        :param pulumi.Input[str] type: String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
        :param pulumi.Input[str] verification_method: String. Domain verification method. Options include `txt`.
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

            if domain is None:
                raise TypeError("Missing required property 'domain'")
            __props__['domain'] = domain
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            if verification_method is None:
                raise TypeError("Missing required property 'verification_method'")
            __props__['verification_method'] = verification_method
            __props__['primary'] = None
            __props__['status'] = None
            __props__['verification'] = None
        super(CustomDomain, __self__).__init__(
            'auth0:index/customDomain:CustomDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain: Optional[pulumi.Input[str]] = None,
            primary: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            verification: Optional[pulumi.Input[pulumi.InputType['CustomDomainVerificationArgs']]] = None,
            verification_method: Optional[pulumi.Input[str]] = None) -> 'CustomDomain':
        """
        Get an existing CustomDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: String. Name of the custom domain.
        :param pulumi.Input[bool] primary: Boolean. Indicates whether or not this is a primary domain.
        :param pulumi.Input[str] status: String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
        :param pulumi.Input[str] type: String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
        :param pulumi.Input[pulumi.InputType['CustomDomainVerificationArgs']] verification: List(Resource). Configuration settings for verification. For details, see Verification.
        :param pulumi.Input[str] verification_method: String. Domain verification method. Options include `txt`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["domain"] = domain
        __props__["primary"] = primary
        __props__["status"] = status
        __props__["type"] = type
        __props__["verification"] = verification
        __props__["verification_method"] = verification_method
        return CustomDomain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        String. Name of the custom domain.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def primary(self) -> pulumi.Output[bool]:
        """
        Boolean. Indicates whether or not this is a primary domain.
        """
        return pulumi.get(self, "primary")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def verification(self) -> pulumi.Output['outputs.CustomDomainVerification']:
        """
        List(Resource). Configuration settings for verification. For details, see Verification.
        """
        return pulumi.get(self, "verification")

    @property
    @pulumi.getter(name="verificationMethod")
    def verification_method(self) -> pulumi.Output[str]:
        """
        String. Domain verification method. Options include `txt`.
        """
        return pulumi.get(self, "verification_method")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

