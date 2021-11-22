# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('auth0')


class _ExportableConfig(types.ModuleType):
    @property
    def client_id(self) -> Optional[str]:
        return __config__.get('clientId')

    @property
    def client_secret(self) -> Optional[str]:
        return __config__.get('clientSecret')

    @property
    def debug(self) -> Optional[bool]:
        return __config__.get_bool('debug') or _utilities.get_env_bool('AUTH0_DEBUG')

    @property
    def domain(self) -> Optional[str]:
        return __config__.get('domain')

