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
    public sealed class AttackProtectionSuspiciousIpThrottlingPreLogin
    {
        /// <summary>
        /// Maximum number of unsuccessful attempts. Only available on public tenants.
        /// </summary>
        public readonly int? MaxAttempts;
        public readonly int? Rate;

        [OutputConstructor]
        private AttackProtectionSuspiciousIpThrottlingPreLogin(
            int? maxAttempts,

            int? rate)
        {
            MaxAttempts = maxAttempts;
            Rate = rate;
        }
    }
}
