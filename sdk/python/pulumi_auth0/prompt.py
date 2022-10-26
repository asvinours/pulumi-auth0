# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PromptArgs', 'Prompt']

@pulumi.input_type
class PromptArgs:
    def __init__(__self__, *,
                 identifier_first: Optional[pulumi.Input[bool]] = None,
                 universal_login_experience: Optional[pulumi.Input[str]] = None,
                 webauthn_platform_first_factor: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Prompt resource.
        :param pulumi.Input[bool] identifier_first: Indicates whether the identifier first is used when using the new Universal Login experience.
        :param pulumi.Input[str] universal_login_experience: Which login experience to use. Options include `classic` and `new`.
        :param pulumi.Input[bool] webauthn_platform_first_factor: Determines if the login screen uses identifier and biometrics first.
        """
        if identifier_first is not None:
            pulumi.set(__self__, "identifier_first", identifier_first)
        if universal_login_experience is not None:
            pulumi.set(__self__, "universal_login_experience", universal_login_experience)
        if webauthn_platform_first_factor is not None:
            pulumi.set(__self__, "webauthn_platform_first_factor", webauthn_platform_first_factor)

    @property
    @pulumi.getter(name="identifierFirst")
    def identifier_first(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the identifier first is used when using the new Universal Login experience.
        """
        return pulumi.get(self, "identifier_first")

    @identifier_first.setter
    def identifier_first(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "identifier_first", value)

    @property
    @pulumi.getter(name="universalLoginExperience")
    def universal_login_experience(self) -> Optional[pulumi.Input[str]]:
        """
        Which login experience to use. Options include `classic` and `new`.
        """
        return pulumi.get(self, "universal_login_experience")

    @universal_login_experience.setter
    def universal_login_experience(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "universal_login_experience", value)

    @property
    @pulumi.getter(name="webauthnPlatformFirstFactor")
    def webauthn_platform_first_factor(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines if the login screen uses identifier and biometrics first.
        """
        return pulumi.get(self, "webauthn_platform_first_factor")

    @webauthn_platform_first_factor.setter
    def webauthn_platform_first_factor(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "webauthn_platform_first_factor", value)


@pulumi.input_type
class _PromptState:
    def __init__(__self__, *,
                 identifier_first: Optional[pulumi.Input[bool]] = None,
                 universal_login_experience: Optional[pulumi.Input[str]] = None,
                 webauthn_platform_first_factor: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Prompt resources.
        :param pulumi.Input[bool] identifier_first: Indicates whether the identifier first is used when using the new Universal Login experience.
        :param pulumi.Input[str] universal_login_experience: Which login experience to use. Options include `classic` and `new`.
        :param pulumi.Input[bool] webauthn_platform_first_factor: Determines if the login screen uses identifier and biometrics first.
        """
        if identifier_first is not None:
            pulumi.set(__self__, "identifier_first", identifier_first)
        if universal_login_experience is not None:
            pulumi.set(__self__, "universal_login_experience", universal_login_experience)
        if webauthn_platform_first_factor is not None:
            pulumi.set(__self__, "webauthn_platform_first_factor", webauthn_platform_first_factor)

    @property
    @pulumi.getter(name="identifierFirst")
    def identifier_first(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the identifier first is used when using the new Universal Login experience.
        """
        return pulumi.get(self, "identifier_first")

    @identifier_first.setter
    def identifier_first(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "identifier_first", value)

    @property
    @pulumi.getter(name="universalLoginExperience")
    def universal_login_experience(self) -> Optional[pulumi.Input[str]]:
        """
        Which login experience to use. Options include `classic` and `new`.
        """
        return pulumi.get(self, "universal_login_experience")

    @universal_login_experience.setter
    def universal_login_experience(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "universal_login_experience", value)

    @property
    @pulumi.getter(name="webauthnPlatformFirstFactor")
    def webauthn_platform_first_factor(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines if the login screen uses identifier and biometrics first.
        """
        return pulumi.get(self, "webauthn_platform_first_factor")

    @webauthn_platform_first_factor.setter
    def webauthn_platform_first_factor(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "webauthn_platform_first_factor", value)


class Prompt(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 identifier_first: Optional[pulumi.Input[bool]] = None,
                 universal_login_experience: Optional[pulumi.Input[str]] = None,
                 webauthn_platform_first_factor: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        With this resource, you can manage your Auth0 prompts, including choosing the login experience version.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_prompt = auth0.Prompt("myPrompt",
            identifier_first=False,
            universal_login_experience="new",
            webauthn_platform_first_factor=True)
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API, prompts can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example

        ```sh
         $ pulumi import auth0:index/prompt:Prompt my_prompt 22f4f21b-017a-319d-92e7-2291c1ca36c4
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] identifier_first: Indicates whether the identifier first is used when using the new Universal Login experience.
        :param pulumi.Input[str] universal_login_experience: Which login experience to use. Options include `classic` and `new`.
        :param pulumi.Input[bool] webauthn_platform_first_factor: Determines if the login screen uses identifier and biometrics first.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PromptArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage your Auth0 prompts, including choosing the login experience version.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_prompt = auth0.Prompt("myPrompt",
            identifier_first=False,
            universal_login_experience="new",
            webauthn_platform_first_factor=True)
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API, prompts can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example

        ```sh
         $ pulumi import auth0:index/prompt:Prompt my_prompt 22f4f21b-017a-319d-92e7-2291c1ca36c4
        ```

        :param str resource_name: The name of the resource.
        :param PromptArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PromptArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 identifier_first: Optional[pulumi.Input[bool]] = None,
                 universal_login_experience: Optional[pulumi.Input[str]] = None,
                 webauthn_platform_first_factor: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PromptArgs.__new__(PromptArgs)

            __props__.__dict__["identifier_first"] = identifier_first
            __props__.__dict__["universal_login_experience"] = universal_login_experience
            __props__.__dict__["webauthn_platform_first_factor"] = webauthn_platform_first_factor
        super(Prompt, __self__).__init__(
            'auth0:index/prompt:Prompt',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            identifier_first: Optional[pulumi.Input[bool]] = None,
            universal_login_experience: Optional[pulumi.Input[str]] = None,
            webauthn_platform_first_factor: Optional[pulumi.Input[bool]] = None) -> 'Prompt':
        """
        Get an existing Prompt resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] identifier_first: Indicates whether the identifier first is used when using the new Universal Login experience.
        :param pulumi.Input[str] universal_login_experience: Which login experience to use. Options include `classic` and `new`.
        :param pulumi.Input[bool] webauthn_platform_first_factor: Determines if the login screen uses identifier and biometrics first.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PromptState.__new__(_PromptState)

        __props__.__dict__["identifier_first"] = identifier_first
        __props__.__dict__["universal_login_experience"] = universal_login_experience
        __props__.__dict__["webauthn_platform_first_factor"] = webauthn_platform_first_factor
        return Prompt(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="identifierFirst")
    def identifier_first(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the identifier first is used when using the new Universal Login experience.
        """
        return pulumi.get(self, "identifier_first")

    @property
    @pulumi.getter(name="universalLoginExperience")
    def universal_login_experience(self) -> pulumi.Output[str]:
        """
        Which login experience to use. Options include `classic` and `new`.
        """
        return pulumi.get(self, "universal_login_experience")

    @property
    @pulumi.getter(name="webauthnPlatformFirstFactor")
    def webauthn_platform_first_factor(self) -> pulumi.Output[bool]:
        """
        Determines if the login screen uses identifier and biometrics first.
        """
        return pulumi.get(self, "webauthn_platform_first_factor")

