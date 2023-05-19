// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class RolePermissionsPermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the permission.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of permission.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Resource server identifier associated with the permission.
        /// </summary>
        [Input("resourceServerIdentifier", required: true)]
        public Input<string> ResourceServerIdentifier { get; set; } = null!;

        /// <summary>
        /// Name of resource server that the permission is associated with.
        /// </summary>
        [Input("resourceServerName")]
        public Input<string>? ResourceServerName { get; set; }

        public RolePermissionsPermissionArgs()
        {
        }
        public static new RolePermissionsPermissionArgs Empty => new RolePermissionsPermissionArgs();
    }
}
