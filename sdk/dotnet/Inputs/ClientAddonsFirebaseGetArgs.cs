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
        [Input("clientEmail")]
        public Input<string>? ClientEmail { get; set; }

        [Input("lifetimeInSeconds")]
        public Input<int>? LifetimeInSeconds { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;
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
