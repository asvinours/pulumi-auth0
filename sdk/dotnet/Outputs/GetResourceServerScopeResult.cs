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
    public sealed class GetResourceServerScopeResult
    {
        public readonly string Description;
        /// <summary>
        /// Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetResourceServerScopeResult(
            string description,

            string name)
        {
            Description = description;
            Name = name;
        }
    }
}
