// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GlobalClientRefreshTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Options include `expiring`, `non-expiring`. Whether a refresh token will expire based on an absolute lifetime, after which the token can no longer be used. If rotation is `rotating`, this must be set to `expiring`.
        /// </summary>
        [Input("expirationType", required: true)]
        public Input<string> ExpirationType { get; set; } = null!;

        /// <summary>
        /// The time in seconds after which inactive refresh tokens will expire.
        /// </summary>
        [Input("idleTokenLifetime")]
        public Input<int>? IdleTokenLifetime { get; set; }

        /// <summary>
        /// Whether inactive refresh tokens should remain valid indefinitely.
        /// </summary>
        [Input("infiniteIdleTokenLifetime")]
        public Input<bool>? InfiniteIdleTokenLifetime { get; set; }

        /// <summary>
        /// Whether refresh tokens should remain valid indefinitely. If false, `token_lifetime` should also be set.
        /// </summary>
        [Input("infiniteTokenLifetime")]
        public Input<bool>? InfiniteTokenLifetime { get; set; }

        /// <summary>
        /// The amount of time in seconds in which a refresh token may be reused without triggering reuse detection.
        /// </summary>
        [Input("leeway")]
        public Input<int>? Leeway { get; set; }

        /// <summary>
        /// Options include `rotating`, `non-rotating`. When `rotating`, exchanging a refresh token will cause a new refresh token to be issued and the existing token will be invalidated. This allows for automatic detection of token reuse if the token is leaked.
        /// </summary>
        [Input("rotationType", required: true)]
        public Input<string> RotationType { get; set; } = null!;

        /// <summary>
        /// The absolute lifetime of a refresh token in seconds.
        /// </summary>
        [Input("tokenLifetime")]
        public Input<int>? TokenLifetime { get; set; }

        public GlobalClientRefreshTokenArgs()
        {
        }
        public static new GlobalClientRefreshTokenArgs Empty => new GlobalClientRefreshTokenArgs();
    }
}
