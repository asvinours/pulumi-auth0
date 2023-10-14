// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsFirebaseGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
        /// </summary>
        [Input("clientEmail")]
        public Input<string>? ClientEmail { get; set; }

        /// <summary>
        /// AWS token lifetime in seconds.
        /// </summary>
        [Input("lifetimeInSeconds")]
        public Input<int>? LifetimeInSeconds { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// Private Key for signing the token (SDK v3+ tokens only).
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKeyId")]
        private Input<string>? _privateKeyId;

        /// <summary>
        /// Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
        /// </summary>
        public Input<string>? PrivateKeyId
        {
            get => _privateKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// Google Firebase Secret. (SDK v2 only).
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClientAddonsFirebaseGetArgs()
        {
        }
        public static new ClientAddonsFirebaseGetArgs Empty => new ClientAddonsFirebaseGetArgs();
    }
}
