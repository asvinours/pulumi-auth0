// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class ResourceServerScope
    {
        /// <summary>
        /// Description of the permission (scope).
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Name of the permission (scope). Examples include `read:appointments` or `delete:appointments`.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private ResourceServerScope(
            string? description,

            string value)
        {
            Description = description;
            Value = value;
        }
    }
}
