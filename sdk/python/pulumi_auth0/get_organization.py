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

__all__ = [
    'GetOrganizationResult',
    'AwaitableGetOrganizationResult',
    'get_organization',
    'get_organization_output',
]

@pulumi.output_type
class GetOrganizationResult:
    """
    A collection of values returned by getOrganization.
    """
    def __init__(__self__, brandings=None, connections=None, display_name=None, id=None, members=None, metadata=None, name=None, organization_id=None):
        if brandings and not isinstance(brandings, list):
            raise TypeError("Expected argument 'brandings' to be a list")
        pulumi.set(__self__, "brandings", brandings)
        if connections and not isinstance(connections, list):
            raise TypeError("Expected argument 'connections' to be a list")
        pulumi.set(__self__, "connections", connections)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        pulumi.set(__self__, "members", members)
        if metadata and not isinstance(metadata, dict):
            raise TypeError("Expected argument 'metadata' to be a dict")
        pulumi.set(__self__, "metadata", metadata)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)

    @property
    @pulumi.getter
    def brandings(self) -> Sequence['outputs.GetOrganizationBrandingResult']:
        """
        Defines how to style the login pages.
        """
        return pulumi.get(self, "brandings")

    @property
    @pulumi.getter
    def connections(self) -> Sequence['outputs.GetOrganizationConnectionResult']:
        return pulumi.get(self, "connections")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        Friendly name of this organization.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def members(self) -> Sequence[str]:
        """
        User ID(s) that are members of the organization.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter
    def metadata(self) -> Mapping[str, str]:
        """
        Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the organization. If not provided, `organization_id` must be set. For performance, it is advised to use the `organization_id` as a lookup if possible.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[str]:
        """
        The ID of the organization. If not provided, `name` must be set.
        """
        return pulumi.get(self, "organization_id")


class AwaitableGetOrganizationResult(GetOrganizationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationResult(
            brandings=self.brandings,
            connections=self.connections,
            display_name=self.display_name,
            id=self.id,
            members=self.members,
            metadata=self.metadata,
            name=self.name,
            organization_id=self.organization_id)


def get_organization(name: Optional[str] = None,
                     organization_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationResult:
    """
    Data source to retrieve a specific Auth0 organization by `organization_id` or `name`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    some_organization_by_name = auth0.get_organization(name="my-org")
    some_organization_by_id = auth0.get_organization(organization_id="org_abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param str name: The name of the organization. If not provided, `organization_id` must be set. For performance, it is advised to use the `organization_id` as a lookup if possible.
    :param str organization_id: The ID of the organization. If not provided, `name` must be set.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getOrganization:getOrganization', __args__, opts=opts, typ=GetOrganizationResult).value

    return AwaitableGetOrganizationResult(
        brandings=__ret__.brandings,
        connections=__ret__.connections,
        display_name=__ret__.display_name,
        id=__ret__.id,
        members=__ret__.members,
        metadata=__ret__.metadata,
        name=__ret__.name,
        organization_id=__ret__.organization_id)


@_utilities.lift_output_func(get_organization)
def get_organization_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                            organization_id: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOrganizationResult]:
    """
    Data source to retrieve a specific Auth0 organization by `organization_id` or `name`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    some_organization_by_name = auth0.get_organization(name="my-org")
    some_organization_by_id = auth0.get_organization(organization_id="org_abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param str name: The name of the organization. If not provided, `organization_id` must be set. For performance, it is advised to use the `organization_id` as a lookup if possible.
    :param str organization_id: The ID of the organization. If not provided, `name` must be set.
    """
    ...
