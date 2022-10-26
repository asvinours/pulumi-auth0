# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RoleArgs', 'Role']

@pulumi.input_type
class RoleArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]]] = None):
        """
        The set of arguments for constructing a Role resource.
        :param pulumi.Input[str] description: Description of the role.
        :param pulumi.Input[str] name: Name for this role.
        :param pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]] permissions: Configuration settings for permissions (scopes) attached to the role.
        """
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the role.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for this role.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]]]:
        """
        Configuration settings for permissions (scopes) attached to the role.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]]]):
        pulumi.set(self, "permissions", value)


@pulumi.input_type
class _RoleState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]]] = None):
        """
        Input properties used for looking up and filtering Role resources.
        :param pulumi.Input[str] description: Description of the role.
        :param pulumi.Input[str] name: Name for this role.
        :param pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]] permissions: Configuration settings for permissions (scopes) attached to the role.
        """
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the role.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for this role.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]]]:
        """
        Configuration settings for permissions (scopes) attached to the role.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionArgs']]]]):
        pulumi.set(self, "permissions", value)


class Role(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RolePermissionArgs']]]]] = None,
                 __props__=None):
        """
        With this resource, you can create and manage collections of permissions that can be assigned to users, which are otherwise known as roles. Permissions (scopes) are created on `ResourceServer`, then associated with roles and optionally, users using this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_resource_server = auth0.ResourceServer("myResourceServer",
            identifier="my-resource-server-identifier",
            signing_alg="RS256",
            token_lifetime=86400,
            skip_consent_for_verifiable_first_party_clients=True,
            enforce_policies=True,
            scopes=[auth0.ResourceServerScopeArgs(
                value="read:something",
                description="read something",
            )])
        my_role = auth0.Role("myRole",
            description="Role Description...",
            permissions=[auth0.RolePermissionArgs(
                resource_server_identifier=my_resource_server.identifier,
                name="read:something",
            )])
        my_user = auth0.User("myUser",
            connection_name="Username-Password-Authentication",
            user_id="auth0|1234567890",
            email="test@test.com",
            password="passpass$12$12",
            nickname="testnick",
            username="testnick",
            roles=[my_role.id])
        ```

        ## Import

        Existing roles can be imported using their ID. # Example

        ```sh
         $ pulumi import auth0:index/role:Role my_role XXXXXXXXXXXXXXXXXXXXXXX
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the role.
        :param pulumi.Input[str] name: Name for this role.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RolePermissionArgs']]]] permissions: Configuration settings for permissions (scopes) attached to the role.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RoleArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can create and manage collections of permissions that can be assigned to users, which are otherwise known as roles. Permissions (scopes) are created on `ResourceServer`, then associated with roles and optionally, users using this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_resource_server = auth0.ResourceServer("myResourceServer",
            identifier="my-resource-server-identifier",
            signing_alg="RS256",
            token_lifetime=86400,
            skip_consent_for_verifiable_first_party_clients=True,
            enforce_policies=True,
            scopes=[auth0.ResourceServerScopeArgs(
                value="read:something",
                description="read something",
            )])
        my_role = auth0.Role("myRole",
            description="Role Description...",
            permissions=[auth0.RolePermissionArgs(
                resource_server_identifier=my_resource_server.identifier,
                name="read:something",
            )])
        my_user = auth0.User("myUser",
            connection_name="Username-Password-Authentication",
            user_id="auth0|1234567890",
            email="test@test.com",
            password="passpass$12$12",
            nickname="testnick",
            username="testnick",
            roles=[my_role.id])
        ```

        ## Import

        Existing roles can be imported using their ID. # Example

        ```sh
         $ pulumi import auth0:index/role:Role my_role XXXXXXXXXXXXXXXXXXXXXXX
        ```

        :param str resource_name: The name of the resource.
        :param RoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RolePermissionArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleArgs.__new__(RoleArgs)

            if description is None:
                description = 'Managed by Pulumi'
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["permissions"] = permissions
        super(Role, __self__).__init__(
            'auth0:index/role:Role',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RolePermissionArgs']]]]] = None) -> 'Role':
        """
        Get an existing Role resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the role.
        :param pulumi.Input[str] name: Name for this role.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RolePermissionArgs']]]] permissions: Configuration settings for permissions (scopes) attached to the role.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleState.__new__(_RoleState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["permissions"] = permissions
        return Role(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the role.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name for this role.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Optional[Sequence['outputs.RolePermission']]]:
        """
        Configuration settings for permissions (scopes) attached to the role.
        """
        return pulumi.get(self, "permissions")

