# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ClientGrantArgs', 'ClientGrant']

@pulumi.input_type
class ClientGrantArgs:
    def __init__(__self__, *,
                 audience: pulumi.Input[str],
                 client_id: pulumi.Input[str],
                 scopes: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        The set of arguments for constructing a ClientGrant resource.
        :param pulumi.Input[str] audience: Audience or API Identifier for this grant.
        :param pulumi.Input[str] client_id: ID of the client for this grant.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: Permissions (scopes) included in this grant.
        """
        pulumi.set(__self__, "audience", audience)
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "scopes", scopes)

    @property
    @pulumi.getter
    def audience(self) -> pulumi.Input[str]:
        """
        Audience or API Identifier for this grant.
        """
        return pulumi.get(self, "audience")

    @audience.setter
    def audience(self, value: pulumi.Input[str]):
        pulumi.set(self, "audience", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[str]:
        """
        ID of the client for this grant.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Permissions (scopes) included in this grant.
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "scopes", value)


@pulumi.input_type
class _ClientGrantState:
    def __init__(__self__, *,
                 audience: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ClientGrant resources.
        :param pulumi.Input[str] audience: Audience or API Identifier for this grant.
        :param pulumi.Input[str] client_id: ID of the client for this grant.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: Permissions (scopes) included in this grant.
        """
        if audience is not None:
            pulumi.set(__self__, "audience", audience)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)

    @property
    @pulumi.getter
    def audience(self) -> Optional[pulumi.Input[str]]:
        """
        Audience or API Identifier for this grant.
        """
        return pulumi.get(self, "audience")

    @audience.setter
    def audience(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "audience", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the client for this grant.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Permissions (scopes) included in this grant.
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "scopes", value)


class ClientGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audience: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Auth0 uses various grant types, or methods by which you grant limited access to your resources to another entity without exposing credentials. The OAuth 2.0 protocol supports several types of grants, which allow different types of access. This resource allows you to create and manage client grants used with configured Auth0 clients.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # The following example grants a client the "create:foo" permission (scope).
        my_client = auth0.Client("myClient")
        my_resource_server = auth0.ResourceServer("myResourceServer",
            identifier="https://api.example.com/client-grant",
            scopes=[
                auth0.ResourceServerScopeArgs(
                    value="create:foo",
                    description="Create foos",
                ),
                auth0.ResourceServerScopeArgs(
                    value="create:bar",
                    description="Create bars",
                ),
            ])
        my_client_grant = auth0.ClientGrant("myClientGrant",
            client_id=my_client.id,
            audience=my_resource_server.identifier,
            scopes=["create:foo"])
        ```

        ## Import

        # Client grants can be imported using the grant ID. # # Application -> APIs -> Expand the required API # # Example

        ```sh
         $ pulumi import auth0:index/clientGrant:ClientGrant my_client_grant cgr_XXXXXXXXXXXXXXXX
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] audience: Audience or API Identifier for this grant.
        :param pulumi.Input[str] client_id: ID of the client for this grant.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: Permissions (scopes) included in this grant.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClientGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Auth0 uses various grant types, or methods by which you grant limited access to your resources to another entity without exposing credentials. The OAuth 2.0 protocol supports several types of grants, which allow different types of access. This resource allows you to create and manage client grants used with configured Auth0 clients.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # The following example grants a client the "create:foo" permission (scope).
        my_client = auth0.Client("myClient")
        my_resource_server = auth0.ResourceServer("myResourceServer",
            identifier="https://api.example.com/client-grant",
            scopes=[
                auth0.ResourceServerScopeArgs(
                    value="create:foo",
                    description="Create foos",
                ),
                auth0.ResourceServerScopeArgs(
                    value="create:bar",
                    description="Create bars",
                ),
            ])
        my_client_grant = auth0.ClientGrant("myClientGrant",
            client_id=my_client.id,
            audience=my_resource_server.identifier,
            scopes=["create:foo"])
        ```

        ## Import

        # Client grants can be imported using the grant ID. # # Application -> APIs -> Expand the required API # # Example

        ```sh
         $ pulumi import auth0:index/clientGrant:ClientGrant my_client_grant cgr_XXXXXXXXXXXXXXXX
        ```

        :param str resource_name: The name of the resource.
        :param ClientGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClientGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audience: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClientGrantArgs.__new__(ClientGrantArgs)

            if audience is None and not opts.urn:
                raise TypeError("Missing required property 'audience'")
            __props__.__dict__["audience"] = audience
            if client_id is None and not opts.urn:
                raise TypeError("Missing required property 'client_id'")
            __props__.__dict__["client_id"] = client_id
            if scopes is None and not opts.urn:
                raise TypeError("Missing required property 'scopes'")
            __props__.__dict__["scopes"] = scopes
        super(ClientGrant, __self__).__init__(
            'auth0:index/clientGrant:ClientGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            audience: Optional[pulumi.Input[str]] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'ClientGrant':
        """
        Get an existing ClientGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] audience: Audience or API Identifier for this grant.
        :param pulumi.Input[str] client_id: ID of the client for this grant.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: Permissions (scopes) included in this grant.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClientGrantState.__new__(_ClientGrantState)

        __props__.__dict__["audience"] = audience
        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["scopes"] = scopes
        return ClientGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def audience(self) -> pulumi.Output[str]:
        """
        Audience or API Identifier for this grant.
        """
        return pulumi.get(self, "audience")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        """
        ID of the client for this grant.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Output[Sequence[str]]:
        """
        Permissions (scopes) included in this grant.
        """
        return pulumi.get(self, "scopes")

